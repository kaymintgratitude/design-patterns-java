package com.design.patterns.creational.builder;

public class LunchOrder {

    public static class Builder{
        private String bread;
        private String meat;
        private String beverage;

        public Builder(){

        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder beverage(String beverage){
            this.beverage = beverage;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }
    }

    private final String bread;
    private final String meat;
    private final String beverage;

    public LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.beverage = builder.beverage;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getBeverage() {
        return beverage;
    }

    @Override
    public String toString() {
        return "LunchOrder{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}
