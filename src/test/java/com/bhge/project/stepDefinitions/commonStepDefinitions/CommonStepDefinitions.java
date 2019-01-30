package com.bhge.project.stepDefinitions.commonStepDefinitions;

import com.bhge.project.stepDefinitions.config.BHGEContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class CommonStepDefinitions implements BHGEContext {

    @Given("^user opens \"([^\"]*)\"$")
    public void openSite(String url) {
        open(url);
    }

    @When("^check \"([^\"]*)\" market site is opened$")
    public void checkMarketPageIsOpened(String url) {
        yandexMarketPage.checkMarketPageIsOpened(url);
    }
}
