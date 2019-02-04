package com.bhge.project.stepDefinitions;

import com.bhge.project.stepDefinitions.config.BHGEContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaptopSearchInYandexMarketDefinitions implements BHGEContext{

    @When("^user clicks on Dell generator on laptop market yandex page$")
    public void clickOnGeneratorButton() {
        laptopSearchInYandexMarketPage.clickOnDellGeneratorButton();
    }

    @When("^user sets (\\d+) on minimum value in the filter by price on laptop market yandex page$")
    public void setMinimumValue(int value) {
        laptopSearchInYandexMarketPage.setMinimumValue(value);
    }

    @When("^user sets (\\d+) on maximum value in the filter by price on laptop market yandex page$")
    public void setMaximumValue(int value) {
        laptopSearchInYandexMarketPage.setMaximumValue(value);
    }

    @When("^user clicks 'по цене' sort button on laptop market yandex page$")
    public void clickSortPrice() {
        laptopSearchInYandexMarketPage.clickSortPrice();
    }


    @Then("^check if only Dell is listed on laptop market yandex page$")
    public void checkDellLaptop() {
        laptopSearchInYandexMarketPage.checkDellLaptop();
    }

    @Then("^results are displayed in ascending order on laptop market yandex page$")
    public void checkDisplayedInAscendingOrderLaptop() {
        laptopSearchInYandexMarketPage.checkDisplayedInAscendingOrderLaptop();
    }

}
