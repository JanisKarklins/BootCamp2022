package com.bootcampexercise.activity.module5.activity;

import com.bootcampexercise.activity.module5.sample.inheritence.Person_I;

public class InheritanceActivity {

    public static void main(String[] args) {

        // Create Person object p. Write code to and set name of Person as Sarah Johnson
        // and age as 21
        Person_I p = new Person_I();
        p.setName("Sarah Johnson");
        p.setAge(21);



        System.out.println(" Person_I ");
        Employee_I e = new Employee_I();
        e.setSalary((int) 70000.00);
        e.setTitle("Developer");
        e.setAge(32);
        e.setName("ShawnCun");



        //Create Employee object e and
        // set salary as 70000.00, title as Developer, age as 32 and name as Shawn Cun


        // Print Info using Employee object
        System.out.println("-----------------------------");
        System.out.println("Employee's Name is   : " + e.getName());
        System.out.println("Employee's Age is    : " + e.getAge());
        System.out.println("Employee's Title is  : " + e.getTitle());
        System.out.println("Employee's Salary is : " + e.getSalary());


        // Print Info using Person object
        System.out.println("Person's Name is    : " + p.getName());
        System.out.println("Person's Age is     : " + p.getAge());

    }

}
