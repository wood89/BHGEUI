package com.bhge.project.pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertTrue;

public class YandexMarketPage {

    public void checkMarketPageIsOpened(String url) {
        assertTrue(url().contains(url));
    }

    public void chooseCategory(String categoryName) {
        SelenideElement mainYandexCategory = $$(".n-w-tab__control-caption").find(text("Компьютерная техника"));
        Selenide.actions().moveToElement(mainYandexCategory).perform();

        SelenideElement category = $(".n-w-tab__column.n-w-tab__column_type_navigation-menu .n-w-navigation-menu.b-zone.b-spy-visible.i-bem.b-spy-visible_js_inited.b-zone_js_inited [title=\"Ноутбуки\"]");
        category.click();
    }

}
