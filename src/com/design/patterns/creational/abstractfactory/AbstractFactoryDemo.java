package com.design.patterns.creational.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args){

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card);
        System.out.println(abstractFactory);

        CreditCardFactory secondAbstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard secondCard = secondAbstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(secondCard);
        System.out.println(secondAbstractFactory);
    }
}
