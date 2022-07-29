package com.bootcampexercise.activity.module10.Exam;

import com.bootcampexercise.activity.module10.Exam.Activity1.Person;

public class Employee extends Person{
    private String company;
    private String jobTitle;
    private double salary;

    public Employee()
    {
        this.jobTitle = "X";
        this.company = "X";
        this.salary = 0;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getCompany() {
        return this.company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce(){
        String One = "My name is " + name + " and I am " + age + " years old.";
        String Two = "I am work as "+ jobTitle + " in "+ company + " and my salary is "+ salary;
        return One + Two;
    }
}
