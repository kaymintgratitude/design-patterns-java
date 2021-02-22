package com.design.patterns.creational.singleton;

public class DbSingletonDemo {

    public static void main(String[] args){
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

        DbSingleton secondInstance = DbSingleton.getInstance();
        System.out.println(secondInstance);

        if(instance == secondInstance){
            System.out.println("Singleton Confirmed");
        }
    }
}
