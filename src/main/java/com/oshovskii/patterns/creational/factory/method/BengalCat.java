package com.oshovskii.patterns.creational.factory.method;

public class BengalCat implements Cat{
    @Override
    public void toEat() {
        System.out.println("Bengal Cat eats chicken...");
    }
}
