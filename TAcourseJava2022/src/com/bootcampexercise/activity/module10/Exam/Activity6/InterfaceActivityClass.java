package com.bootcampexercise.activity.module10.Exam.Activity6;

public class InterfaceActivityClass {

    public static void main(String[] args) {
        bike b = new bike();
        car c = new car();

        b.start();
        c.start();

        b.stop();
        c.stop();
    }
}