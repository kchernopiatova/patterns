package com.solvd.patterns.facade;

import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.solvd.patterns.factory.OnlinerPageFactory;
import com.solvd.patterns.factory.PageType;
import com.solvd.patterns.factory.pages.CatalogPage;
import com.solvd.patterns.factory.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class OnlinerInterface implements IDriverPool{

    private final HomePage homePage;
    private final WebDriver driver = getDriver();
    private CatalogPage catalogPage;

    public OnlinerInterface() {
        OnlinerPageFactory onlinerPageFactory = new OnlinerPageFactory();
        this.homePage = (HomePage) onlinerPageFactory.create(PageType.HOME);
        homePage.open();
    }

    public void switchPages() {
        this.catalogPage = homePage.catalogPageClick(driver);
        catalogPage.logoClick(driver);
    }
}
