package com.bootcampexercise.activity.module5.AbstractClassActivity2;

public class AbstractActivity {

    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        rectangle.setSideA(3);
        rectangle.setSideB(12);

        System.out.println("The color of the rectangle is "+rectangle.getColor());
        System.out.println("The area of the rectangle is "+rectangle.calculatePerimeter());
        System.out.println("The perimeter of the rectangle is "+rectangle.calculateArea());


        // set and Print color of circle

        Circle circle = new Circle();
        circle.setRadius(14);
        circle.setColor("Blue");

        // Give area of circle
        // Print perimeter of circle

        System.out.println("The perimeter of the circle is "+circle.calculatePerimeter());
        System.out.println("The area of the circle is "+circle.calculateArea());
    }
}
