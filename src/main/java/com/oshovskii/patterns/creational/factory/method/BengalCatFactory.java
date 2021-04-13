package com.oshovskii.patterns.creational.factory.method;

public class BengalCatFactory implements CatFactory{
    @Override
    public Cat createCat() {
        return new BengalCat();
    }
}
