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
        SelenideElement mainYandexCategory = $$(".n-w-tab__control-caption").find(text("Бытовая техника"));
        Selenide.actions().moveToElement(mainYandexCategory);

//        SelenideElement category = $(".n-w-navigation-menu__node-link-group .link.n-w-navigation-menu__node-link.b-zone.b-spy-events.i-bem.link_js_inited + [title=\"Ноутбуки\"]");
//        category.click();
    }

}
