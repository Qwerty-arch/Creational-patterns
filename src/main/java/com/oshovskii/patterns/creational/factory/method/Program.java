package com.oshovskii.patterns.creational.factory.method;

public class Program {
    public static void main(String[] args) {
        CatFactory catFactory = createCatByBreed("savanna");
        Cat cat = catFactory.createCat();

        cat.toEat();
    }

    public static CatFactory createCatByBreed(String breed){
        if (breed.equalsIgnoreCase("savanna")) {
            return new SavannahCatFactory();
        } else if (breed.equalsIgnoreCase("bengal")) {
            return new BengalCatFactory();
        } else {
            throw new RuntimeException(breed + " is not found.");
        }
    }
}
