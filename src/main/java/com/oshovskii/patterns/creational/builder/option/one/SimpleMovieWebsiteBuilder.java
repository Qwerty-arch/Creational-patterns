package com.oshovskii.patterns.creational.builder.option.one;

public class SimpleMovieWebsiteBuilder extends WebsiteBuilder{
    @Override
    public void buildName() {
        website.setName("Movie");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        website.setPrice(10000);
    }
}
