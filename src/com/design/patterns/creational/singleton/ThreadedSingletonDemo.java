package com.design.patterns.creational.singleton;

public class ThreadedSingletonDemo {

    public static void main(String[] args){
        ThreadsafeSingleton firstInstance = ThreadsafeSingleton.getInstance();
        System.out.println(firstInstance);

        ThreadsafeSingleton secondInstance = ThreadsafeSingleton.getInstance();
        System.out.println(secondInstance);

        if(secondInstance == firstInstance){
            System.out.println("Threaded Singleton confirmed");
        }

        System.out.println(EnumSingleton.INSTANCE);

    }
}
