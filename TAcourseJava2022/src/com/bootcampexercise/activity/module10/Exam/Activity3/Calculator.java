package com.bootcampexercise.activity.module10.Exam.Activity3;

public class Calculator {

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.division(2,20));
        System.out.println(2.0/20.0);
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int addition(int a) {
        return a + a;
    }

   // public int subtraction(int a, int b) {
    //    return a - b;
   // }
   public int subtraction(int a, int b) {
       int diff = 0;
       if (a > b) {
           diff = a - b;
       } else {
           diff = a - b;
       }
       return diff;
   }
    public int multiplication(int a, int b) throws CustomExceptions {

        if (a == 0 || b == 0) {
            throw new CustomExceptions();
        } else {
            return a * b;
        }
    }

    public String division(int a, int b) {
        double result = 0.0;
        try {
            result = (a / b);
            return String.valueOf(result);
        } catch (ArithmeticException e) {
            return "Division by Null is not allowed";
        }
    }
}