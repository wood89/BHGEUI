package com.bhge.project.stepDefinitions.config;

import com.bhge.project.pageObjects.LaptopSearchInYandexMarketPage;
import com.bhge.project.pageObjects.YandexMarketPage;
import com.bhge.project.pageObjects.YandexPage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public interface BHGEContext {

    ApplicationContext context =
            new FileSystemXmlApplicationContext("classpath:message-bean.xml");

    YandexPage yandexPage = (YandexPage) context.getBean("yandexPage");

    YandexMarketPage yandexMarketPage = (YandexMarketPage) context.getBean("yandexMarketPage");

    LaptopSearchInYandexMarketPage laptopSearchInYandexMarketPage = (LaptopSearchInYandexMarketPage) context.getBean("laptopSearchInYandexMarketPage");
}
