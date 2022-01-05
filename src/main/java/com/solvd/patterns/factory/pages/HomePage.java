package com.solvd.patterns.factory.pages;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.patterns.factory.components.CategoryBlock;
import com.solvd.patterns.factory.components.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends OnlinerPage {

    @FindBy(xpath = "//*[@class='b-main-page-grid-4 b-main-page-news-2']")
    private List<CategoryBlock> categoryBlocks;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("home_url"));
    }

    @Override
    public void describe() {
        System.out.println("This is onliner home page");
    }

    public CatalogPage catalogPageClick(WebDriver driver) {
        Header header = super.getHeader();
        List<ExtendedWebElement> menu = header.getMenu();
        ExtendedWebElement catalogItem = menu.stream()
                .filter(menuItem -> "каталог".equalsIgnoreCase(menuItem.getText()))
                .findFirst().get();
        catalogItem.click();
        return new CatalogPage(driver);
    }

    public List<CategoryBlock> getCategoryBlocks() {
        return categoryBlocks;
    }
}