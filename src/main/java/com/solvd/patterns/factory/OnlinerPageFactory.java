package com.solvd.patterns.factory;

import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.solvd.patterns.factory.pages.CatalogPage;
import com.solvd.patterns.factory.pages.HomePage;
import com.solvd.patterns.factory.pages.OnlinerPage;
import com.solvd.patterns.factory.pages.ProductPage;
import org.openqa.selenium.WebDriver;

public class OnlinerPageFactory implements IDriverPool {

    private static WebDriver driver;

    public OnlinerPageFactory() {
        driver = getDriver();
    }

    public OnlinerPage create(PageType type) {

        OnlinerPage onlinerPage = null;
        switch (type) {
            case HOME:
                onlinerPage = new HomePage(driver);
                break;
            case CATALOG:
                onlinerPage = new CatalogPage(driver);
                break;
            case PRODUCT:
                onlinerPage = new ProductPage(driver);
                break;
            default:
                onlinerPage = new OnlinerPage(driver);
                break;
        }
        return onlinerPage;
    }
}
