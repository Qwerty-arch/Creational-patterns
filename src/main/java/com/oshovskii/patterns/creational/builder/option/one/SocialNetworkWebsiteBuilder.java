package com.oshovskii.patterns.creational.builder.option.one;

public class SocialNetworkWebsiteBuilder extends WebsiteBuilder{
    @Override
    public void buildName() {
        website.setName("Social Network");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(100000);
    }
}
