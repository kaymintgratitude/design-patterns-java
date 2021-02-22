package com.design.patterns.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    private EnumSingleton(){
        System.out.println("Enum Singleton");
    }
}
