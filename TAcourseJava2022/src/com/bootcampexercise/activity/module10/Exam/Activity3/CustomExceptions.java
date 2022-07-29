package com.bootcampexercise.activity.module10.Exam.Activity3;

public class CustomExceptions extends Exception{

    public String getMessage() {
        return "The result of multiplying by zero is always zero";
    }
}