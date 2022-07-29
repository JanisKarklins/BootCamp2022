package com.bootcampexercise.activity.module10.Exam.Activity1;

public abstract class Person {
    // ** Attributes

    public String name;
    public int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String introduce();

}