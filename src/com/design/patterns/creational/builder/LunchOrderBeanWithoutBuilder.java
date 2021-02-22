package com.design.patterns.creational.builder;

public class LunchOrderBeanWithoutBuilder {

    private String meat;
    private String bread;
    private String beverage;

    public LunchOrderBeanWithoutBuilder(){ }

    // Telescoping constructors
    public LunchOrderBeanWithoutBuilder(String meat){
        this.meat = meat;
    }

    public LunchOrderBeanWithoutBuilder(String meat, String bread){
        this(meat);
        this.bread = bread;
    }

    public LunchOrderBeanWithoutBuilder(String meat, String beverage, String bread){
        this(meat, bread);
        this.beverage = beverage;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }




}
