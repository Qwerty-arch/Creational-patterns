package com.oshovskii.patterns.creational.factory.method;

public class SavannahCatFactory implements CatFactory{
    @Override
    public Cat createCat() {
        return new SavannahCat();
    }
}
