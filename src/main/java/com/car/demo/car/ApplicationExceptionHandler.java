package com.car.demo.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.car.demo.car.exception.CarException;
import com.car.demo.car.exception.CarStringNotFound;
import com.car.demo.car.exception.CarYearNotFound;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(CarYearNotFound.class)
    public ResponseEntity<Object> handleyearCarNotFoundException(CarYearNotFound ex){
        List<String> allError = Arrays.asList(ex.getLocalizedMessage());
        CarException getEx = new CarException(allError);
        return new ResponseEntity<>(getEx, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CarStringNotFound.class)
    public ResponseEntity<Object> handleStringNotFoundException(CarStringNotFound ex){
        List<String> allError = Arrays.asList(
            ex.getLocalizedMessage()
        );

        CarException err = new CarException(allError);
        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        // TODO Auto-generated method stub
        List<ObjectError> errors = ex.getBindingResult().getAllErrors();
        List<String> errorsMessage = new ArrayList<>();

        for(ObjectError err : errors){
            errorsMessage.add(err.getDefaultMessage());
        }

        CarException err = new CarException(errorsMessage);

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    
}
