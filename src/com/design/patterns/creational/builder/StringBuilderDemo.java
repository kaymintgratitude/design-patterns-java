package com.design.patterns.creational.builder;

public class StringBuilderDemo {

    public static void main(String[] args){

        StringBuilder builder = new StringBuilder();

        builder.append("First line");
        builder.append(90000);
        builder.append("Some lines");

        System.out.println(builder.toString());
    }
}
