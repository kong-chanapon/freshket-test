package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> foodSet = new HashMap<>();
        foodSet.put("red", 50);
        foodSet.put("green", 40);
        foodSet.put("blue", 30);
        foodSet.put("yellow", 50);
        foodSet.put("pink", 80);
        foodSet.put("purple", 90);
        foodSet.put("orange", 120);

        MemberCard memberCard = new MemberCard(0.1);

        Map<String, Integer> cart1 = new HashMap<>();
        cart1.put("red", 1);
        cart1.put("green", 1);

        Map<String, Integer> cart2 = new HashMap<>();
        cart2.put("orange", 5);


        Calculator calculator1 = new Calculator(memberCard, foodSet);
        System.out.println(calculator1.resultPrice(cart1));

        Calculator calculator2 = new Calculator(foodSet);
        System.out.println(calculator2.resultPrice(cart2));


    }
}