package com.oshovskii.patterns.creational.builder.option.one;

public class Director {
    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    public Website buildWebsite() {
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCms();
        websiteBuilder.buildPrice();

        Website website = websiteBuilder.getWebsite();

        return website;
    }
}
