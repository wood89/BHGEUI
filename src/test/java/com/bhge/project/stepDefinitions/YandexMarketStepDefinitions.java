package com.bhge.project.stepDefinitions;

import com.bhge.project.stepDefinitions.config.BHGEContext;
import cucumber.api.java.en.When;

public class YandexMarketStepDefinitions implements BHGEContext {

    @When("^user chooses \"([^\"]*)\" category on market yandex page$")
    public void chooseCategory(String categoryName) {
        yandexMarketPage.chooseCategory(categoryName);
    }
}
