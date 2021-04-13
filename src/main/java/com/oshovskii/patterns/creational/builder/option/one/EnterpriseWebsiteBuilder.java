package com.oshovskii.patterns.creational.builder.option.one;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    public void buildName() {
        website.setName("Enterprise");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(150000);
    }
}
