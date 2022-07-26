package com.bootcampexercise.activity.module2.activity;

public class FindInArray {

    public static void main(String[] args) { //activity Find In Array
        // Create an integer array
        int[] nums = {100, 1, 4, 15};

        int result = nums[0];

        // Find smallest in an array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < result) {
                result = nums[i];
            }
        }
        System.out.println("smallest in array is " + result);

        result = nums[0];

        //TODO Find largest in an array
        for (int i = 1; i < nums.length; i++) {
            //TODO complete the code
            if (nums[i] > result) {
                result = nums[i];
            }

        }
        System.out.println("Largest in array is " + result);
    }
}