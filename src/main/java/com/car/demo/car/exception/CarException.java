package com.car.demo.car.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CarException {
    private List<String> problems;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timeStamp;

    public CarException(List<String> problems) {
        this.problems = problems;
        timeStamp = LocalDateTime.now();
    }


    public List<String> getProblems() {
        return this.problems;
    }

    public void setProblems(List<String> problems) {
        this.problems = problems;
    }

    public LocalDateTime getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }


}
