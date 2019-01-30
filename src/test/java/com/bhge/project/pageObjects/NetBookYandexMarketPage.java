package com.bhge.project.pageObjects;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class NetBookYandexMarketPage {

    public void checkNetBookYandexMarketPageIsOpened(String url) {
        assertEquals(url(), url);
    }


}
