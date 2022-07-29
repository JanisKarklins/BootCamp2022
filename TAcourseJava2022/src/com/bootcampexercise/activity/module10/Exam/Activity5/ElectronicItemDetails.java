package com.bootcampexercise.activity.module10.Exam.Activity5;

import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {
    public static void main(String[] args) {
        Map<String, Double> itemHashMap = new HashMap<>();
        itemHashMap.put("TV", 9.11);
        itemHashMap.put("Refrigerator", 99.22);
        itemHashMap.put("Washing Machine", 199.33);
        itemHashMap.put("Laptop", 299.44);

        ElectronicItemDetails obj = new ElectronicItemDetails();
        System.out.println("Price of TV is " + obj.returnPriceOfItem(itemHashMap, "TV"));
    }
    public double returnPriceOfItem(Map<String, Double> map, String name){
        return map.get(name);
    }
}