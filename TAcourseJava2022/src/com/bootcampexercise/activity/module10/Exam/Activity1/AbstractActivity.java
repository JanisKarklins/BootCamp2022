package com.bootcampexercise.activity.module10.Exam.Activity1;

import com.bootcampexercise.activity.module10.Exam.Employee;

public abstract class AbstractActivity {
    public static void main(String args[]) {

        Employee emp = new Employee();

        System.out.println("Employee");
        emp.setName("Jack White");
        emp.setAge(77);
        emp.setCompany("ABC");
        emp.setJobTitle("Nobody");
        emp.setSalary(999);

        System.out.println(emp.introduce());
        Students st = new Students();
        System.out.println("Student");
        st.setSchoolName("Nowhere");
        System.out.println(st.introduce());

    }
}