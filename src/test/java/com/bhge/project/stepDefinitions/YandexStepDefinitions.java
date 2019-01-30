package com.bhge.project.stepDefinitions;

import com.bhge.project.stepDefinitions.config.BHGEContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class YandexStepDefinitions implements BHGEContext {

    @When("^user clicks on market button on yandex page$")
    public void clickCityButton() {
        yandexPage.clickMarketButton();
    }

}
