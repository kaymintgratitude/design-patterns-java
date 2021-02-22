package com.design.patterns.creational.singleton;

public class LazyLoadedSingleton {

    private static LazyLoadedSingleton instance;

    private LazyLoadedSingleton(){}

    public static LazyLoadedSingleton getInstance(){
        if(instance == null){
            return new LazyLoadedSingleton();
        }
        return instance;
    }
}
