package com.bootcampexercise.activity.module8.activity;

//Needs to be completed

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name

        Map names = new HashMap();

        names.put("1", "Janis");
        names.put("2", "Jana");
        names.put("3", "Liga");
        names.put("4", "Arturs");
        names.put("5", "Arnis");
        names.put("6", "Agris");
        names.put("7", "Andris");
        names.put("8", "Aleks");

        //2 - Call print method to print the map passed as its parameter.

        MapActivity obj = new MapActivity();
        obj.print(names);
    }

    void print(Map map)
    {
        //3 - Type code to print this map
        Set keySet = map.keySet();

        System.out.println("*************************************");
        System.out.println("Key\tValue");
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println("*************************************");

    }
}