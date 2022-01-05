package com.solvd.patterns.factory;

import com.solvd.patterns.factory.pages.OnlinerPage;

/*
Паттерн factory может использоваться при создании объектов со схожим функционалом
также можно использовать, если информация о том, какой объект необходимо создать приходит
во время выполнения программы
 */

public class FactoryMain {

    public static void main(String[] args) {

        OnlinerPageFactory onlinerPageFactory = new OnlinerPageFactory();
        OnlinerPage firstPage = onlinerPageFactory.create(PageType.HOME);
        firstPage.describe();

        OnlinerPage secondPage = onlinerPageFactory.create(PageType.PRODUCT);
        secondPage.describe();
    }
}
