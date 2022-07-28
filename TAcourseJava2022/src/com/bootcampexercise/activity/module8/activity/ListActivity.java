package com.bootcampexercise.activity.module8.activity;

//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List myList = new ArrayList();
        myList.add("Janis");
        myList.add("Jana");
        myList.add(0, "Andris");
        
        //TODO: 2 - Call print method to print the list passed as its parameter.

        ListActivity obj = new ListActivity();
        obj.printList(myList);
    }

    void printList(List list){

        Iterator<Object> myIterator = list.iterator();
        System.out.println("List of Names");

        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}
