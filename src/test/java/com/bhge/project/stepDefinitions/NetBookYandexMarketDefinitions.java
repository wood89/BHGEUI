package com.bhge.project.stepDefinitions;

import com.bhge.project.stepDefinitions.config.BHGEContext;
import cucumber.api.java.en.When;

public class NetBookYandexMarketDefinitions implements BHGEContext{

    @When("^check netBook category is opened on \"([^\"]*)\" url$")
    public void checkMarketPageIsOpened(String url) {
        netBookYandexMarketPage.checkNetBookYandexMarketPageIsOpened(url);
    }
}
