package com.design.patterns.creational.builder;

public class LunchOrderBuilderDemo {

    public static void main(String[] args){

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.beverage("Tea").bread("Sugar Bread").meat("Corned Beef");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder);
    }
}
