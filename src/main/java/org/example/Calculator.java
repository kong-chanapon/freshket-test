package org.example;

import java.util.Map;

public class Calculator {
    private  MemberCard memberCard;
    Map<String, Integer> foodSet;

    public Calculator(MemberCard memberCard, Map<String, Integer> foodSet) {
        this.memberCard = memberCard;
        this.foodSet = foodSet;
    }

    public Calculator(Map<String, Integer> foodSet) {
        this.foodSet = foodSet;
    }

    public double resultPrice(Map<String, Integer> cart){
        double result = 0;
        double discountMemberCard = 0;
        double discountFoodSet = 0;
        int pairs = 2;
        double percentDiscountFoodSet = 0.05;

        for(String food: cart.keySet()){
            if(foodSet.containsKey(food)){
                result += foodSet.get(food) * cart.get(food);
            }
        }

        if(memberCard != null){
            discountMemberCard = result * memberCard.getDiscount();
        }

        for(String food: cart.keySet()){
            if(foodSet.containsKey(food)){
                if(cart.get(food) >= pairs){
                    discountFoodSet  += foodSet.get(food) * pairs * percentDiscountFoodSet * (cart.get(food) / pairs);
                }
            }
        }


        return  result - discountMemberCard - discountFoodSet;
    }
}
