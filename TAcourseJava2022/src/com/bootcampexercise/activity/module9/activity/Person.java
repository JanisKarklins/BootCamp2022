package com.bootcampexercise.activity.module9.activity;

public class Person {
    private int weight;
    private float height;

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight

    public double bodyMassInd(int weight, float height) {
        double bmi = 0;
        if(weight>0 && height>0 && weight<200 && height<2) {
            bmi = weight / Math.sqrt(height);
            System.out.println("Result " + bmi + " BMI");
        }else if(weight>200 && height>2){
            System.out.println("Result invalid");
        }
        return bmi;
    }
}
    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
    //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)
    //TODO: Please add some checks for max weight and height (kg and meter are their units)
    //TODO: Also add some checks that value shouldn't be negative and 0
//    Note: All TODOs should be implemented in single method

