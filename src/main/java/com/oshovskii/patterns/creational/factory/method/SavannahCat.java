package com.oshovskii.patterns.creational.factory.method;

public class SavannahCat implements Cat{

    @Override
    public void toEat() {
        System.out.println("Savannah Cat eats meat...");
    }
}
