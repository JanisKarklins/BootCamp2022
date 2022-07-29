package com.bootcampexercise.activity.module10.Exam.Activity1;

public class Students extends Person{
    private String schoolName;
    Students(){
        this.schoolName = "X";
    }
    public String setSchoolName(String schoolName){
        this.schoolName = schoolName;
        return schoolName;
    }
    public String getJobTitle(){
        return schoolName;
    }
    public String introduce(){
        String One = "I study in university " + schoolName + ".";
        return One;
    }
}