package com.bhge.project.stepDefinitions;

import com.bhge.project.stepDefinitions.config.BHGEContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class YandexStepDefinitions implements BHGEContext {

    @Given("^user opens \"([^\"]*)\"$")
    public void openSite(String url) {
        open(url);
    }

    @When("^user clicks on market button on yandex page$")
    public void clickCityButton() {
        yandexPage.clickMarketButton();
    }

}
