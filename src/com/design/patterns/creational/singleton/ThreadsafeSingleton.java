package com.design.patterns.creational.singleton;

public class ThreadsafeSingleton {

    private static volatile ThreadsafeSingleton instance;

    private ThreadsafeSingleton(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static ThreadsafeSingleton getInstance(){
        if(instance == null) return new ThreadsafeSingleton();
        return instance;
    }
}
