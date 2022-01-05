package com.solvd.patterns.factory.pages;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public class CatalogPage extends OnlinerPage {

    public CatalogPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("catalog_url"));
    }

    @Override
    public void describe() {
        System.out.println("This is onliner catalog page");
    }

    public HomePage logoClick(WebDriver driver) {
        ExtendedWebElement logo = super.getHeader().getLogo();
        logo.click();
        return new HomePage(driver);
    }
}
