package com.bhge.project.pageObjects;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LaptopSearchInYandexMarketPage {

    String DELL = "DELL";
    String PREFIX_PRICE = "от";
    String POSTFIX_PRICE = "\u20BD";

    String PRICE_EXCEPTION = "incorrect price sort";
    String SORT_EXCEPTION = "incorrect DELL generator";

    private final SelenideElement minimumValueArea = $("[name=\"Цена от\"]");
    private final SelenideElement maximumValueArea = $("[name=\"Цена до\"]");

    private final SelenideElement loadNetBooksArea = $(".layout__col.i-bem.layout__col_search-results_normal [style=\"height: auto;\"]");

    public void clickOnDellGeneratorButton() {

        Selenide.executeJavaScript("window.scrollBy(0,250)", "");

        SelenideElement sortPriceButton = $$(".NVoaOvqe58").find(text(DELL));
        sortPriceButton.click();

        Selenide.executeJavaScript("window.scrollBy(0,-250)", "");
    }

    public void setMinimumValue(int value) {
        minimumValueArea.setValue(String.valueOf(value));
    }

    public void setMaximumValue(int value) {
        maximumValueArea.setValue(String.valueOf(value));
    }

    public void clickSortPrice() {
        SelenideElement sortPriceButton = $$(".link.link_theme_major.n-filter-sorter__link.i-bem.link_js_inited").find(text("по цене"));
        sortPriceButton.click();

        loadNetBooksArea.shouldBe(visible);
    }

    public void checkDellLaptop() {
        try {
            for(SelenideElement laptopTitle: $$(".n-snippet-card2__title")) {
                String title = laptopTitle.text();

                if(!title.contains(DELL)) {
                    System.out.println(SORT_EXCEPTION);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkDisplayedInAscendingOrderLaptop() {
        try {
            int count = 0;

            for(SelenideElement priceWithAttributes: $$(".n-snippet-card2__main-price-wrapper .price")) {
                int price = getParsedPrice(priceWithAttributes.text());

                if (price >= count) {
                    count = price;
                } else {
                    System.out.println(PRICE_EXCEPTION);
                }
            }
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private int getParsedPrice(String price) throws NumberFormatException {
        String finalPrice = "";

        if(price.contains(POSTFIX_PRICE)){
            if(price.contains(PREFIX_PRICE)) {
                finalPrice = price.substring(price.indexOf(PREFIX_PRICE) + 3, price.indexOf(POSTFIX_PRICE) - 1);
            } else {
                finalPrice = price.substring(0, price.indexOf(POSTFIX_PRICE) - 1);
            }
            finalPrice = finalPrice.replaceAll("\\s+", "");
        } else {
            finalPrice = price;
        }
        return Integer.parseInt(finalPrice);
    }
}
