package com.design.patterns.creational.abstractfactory;

public class AmexValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
