package com.bootcampexercise.activity.module8.activity;

//Needs to be completed

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.

        //Also try adding a few duplicate entries to this set.

        Set mySet = new HashSet();
        mySet.add("Janis");
        mySet.add("Janis");
        mySet.add("Jana");
        mySet.add("Liga");
        mySet.add("Inga");

        //TODO: 2 - Call print method to print the set passed as its parameter.
        
        print(mySet);
        TreeSet myTreeSet = new TreeSet(mySet);
        print(myTreeSet);

    }

    static void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.

        System.out.println(set);
    }
}