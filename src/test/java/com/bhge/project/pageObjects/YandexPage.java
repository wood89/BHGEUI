package com.bhge.project.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class YandexPage {

    private final SelenideElement marketButton = $("[data-id=\"market\"]");

    public void clickMarketButton() { marketButton.click(); }
}
