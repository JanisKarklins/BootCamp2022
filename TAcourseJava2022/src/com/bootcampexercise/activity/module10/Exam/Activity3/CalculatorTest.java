package com.bootcampexercise.activity.module10.Exam.Activity3;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator numbers;

    protected void setUp() throws Exception {
        super.setUp();
        numbers = new Calculator();
    }

    protected void tearDown() throws Exception {
        numbers = null;
        super.tearDown();
    }
//Addition
    public void testAdditionExact() {
        int a = 5;
        int b = 94;
        assertEquals(99, numbers.addition(a, b));
        assertEquals(99, numbers.addition(b, a));
    }
    public void testAdditionNegative() {
        int a = -5;
        int b = 54;
        assertEquals(49, numbers.addition(a, b));
        assertEquals(49, numbers.addition(b, a));
    }
    public void testAdditionNegatives() {
        int a = -10;
        int b = -25;
        assertEquals(-35, numbers.addition(a, b));
        assertEquals(-35, numbers.addition(b, a));
    }
    public void testAdditionEquals() {
        int a = 10;
        assertEquals(20, numbers.addition(a));
    }
    public void testAdditionEqualsNegatives() {
        int b = -5;
        assertEquals(-10, numbers.addition(b));
    }
//Substraction
    public void testSubtractionPositives() {
        int a = 54;
        int b = 20;
        assertEquals(34, numbers.subtraction(a, b));
        assertEquals(-34, numbers.subtraction(b, a));
    }
    public void testSubtractionNegatives() {
        int a = -30;
        int b = -5;
            assertEquals(35, numbers.subtraction(a, b));
            assertEquals(-35, numbers.subtraction(b, a));
    }
    public void testSubtractionNegativesPositives() {
        int a = 10;
        int b = -5;
        assertEquals(15, numbers.subtraction(a, b));
        assertEquals(-15, numbers.subtraction(b, a));
    }
//Multiplication
    public void testMultiplication() throws CustomExceptions {
        int a = 6;
        int b = 2;
        assertEquals(12, numbers.multiplication(a, b));
        assertEquals(12, numbers.multiplication(b, a));
    }
    public void testMultiplicationNegatives() throws CustomExceptions { //two negatives is a positive
        int a = -10;
        int b = -50;
        assertEquals(500, numbers.multiplication(a, b));
        assertEquals(500, numbers.multiplication(b, a));
    }
    public void testMultiplicationNegativesPositives() throws CustomExceptions { //One negatives in negative
        int a = -6;
        int b = 10;
        assertEquals(-60, numbers.multiplication(a, b));
        assertEquals(-60, numbers.multiplication(b, a));
    }
//Division
    public void testDivision() {
        int a = 20;
        int b = 2;
        assertEquals("10.0", numbers.division(a, b));
        assertEquals("0.0", numbers.division(b, a));
    }
    public void testDivisionByNull() { //Can`t divide by Null
        int a = 0;
        int b = 10;
        assertEquals("0.0", numbers.division(a, b));
        assertEquals("Division by Null is not allowed", numbers.division(b, a));
    }
}
