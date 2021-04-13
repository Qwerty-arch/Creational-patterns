package com.oshovskii.patterns.creational.builder.option.one;

public abstract class WebsiteBuilder {
    Website website;

    public void createWebsite() {
        website  = new Website();
    }

    public abstract void buildName();
    public abstract void buildCms();
    public abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}
