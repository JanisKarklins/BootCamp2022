package com.bootcampexercise.activity.module2.activity;

public class MultiplicationTable { //activity 6
    /**
     *
     */
//package sef.module2.activity;
    /**
     * @author
     *
     */
   // public class MultiplicationTable {
        /**
         * @param args
         */
        public static void main(String[] args) {
        int i = 0;
        int j = 0;

            // Table from 1 to 10
            for ( i = 11; i <= 20; i++) {
                System.out.println("*** Table of "+i + " ***");
                for ( j = 0; j <= 10; j++) {
                    System.out.println(i + "X" + j +" = " + i*j);
                }
            }
            // Table from 11 to 20

            //TODO: complete code. write for loop for int i
            System.out.println("*** Table of "+ i + " ***");
            //TODO: complete code. write nested for loop for int j
            System.out.println(i + "X" + j +" = " + i*j);
        }
    }



