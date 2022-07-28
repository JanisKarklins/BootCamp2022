package com.bootcampexercise.activity.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

        //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

        //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

        //TODO: create unit tests for getters and setters

    public void testSetAndGetHeight() {
            float testHeight1 = 1.7f;
            person.setHeight(testHeight1);
            assertEquals(testHeight1, person.getHeight());
    }

    public void testSetAndGetWeight() {
        int testWeight1 = 78;
        person.setWeight(testWeight1);
        assertEquals(testWeight1, person.getWeight());
    }

        //TODO: create unit test for getBodyMassIndex method

    public void test1() {
        double bmi = person.bodyMassInd(0, 0);
        assertEquals(0.0, bmi);
    }

    public void test2() {
        double bmi = person.bodyMassInd(100, 1.7f);
        double bmiExpected = 100 / Math.sqrt(1.5);
        assertEquals(bmiExpected,bmi);
    }

    public void test3() {
        double bmi = person.bodyMassInd(100, -2.0f);
        double bmiExpected = 100 / Math.sqrt(-2.0);
        assertEquals(bmiExpected,bmi);
    }

    public void test4() {
        double bmi = person.bodyMassInd(-100, 1.9f);
        double bmiExpected = -100 / Math.sqrt(1.9);
        assertEquals(bmiExpected,bmi);
    }
}
