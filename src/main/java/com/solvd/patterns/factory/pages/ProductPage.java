package com.solvd.patterns.factory.pages;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends OnlinerPage {

    @FindBy(className = "catalog-masthead__title")
    private ExtendedWebElement name;

    @FindBy(xpath = "//*[@class='catalog-masthead-controls__input i-checkbox i-checkbox_yellow']/input")
    private ExtendedWebElement compareCheckbox;

    @FindBy(xpath = "//*[@class='product-header']//*[@class='compare-button__sub compare-button__sub_main']/span")
    private ExtendedWebElement comparePageButton;

    public ProductPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("product_ex_url"));
    }

    @Override
    public void describe() {
        System.out.println("This is onliner product page");
    }

    public boolean isComparePageButtonPresent() {
        return !getDriver().findElement(By.xpath("//*[@class='product-header']//*[@class='compare-button__sub compare-button__sub_main' " +
                "and @href='https://catalog.onliner.by/compare/']")).isDisplayed();
    }

    public String getButtonText() {
        return comparePageButton.getText();
    }

    public boolean isCompareEmpty() {
        String emptyText = "0 товаров в сравнении";
        return emptyText.equalsIgnoreCase(getButtonText());
    }

    public ExtendedWebElement getProductName() {
        return name;
    }

    public ExtendedWebElement getCompareCheckbox() {
        return compareCheckbox;
    }

    public ExtendedWebElement getComparePageButton() {
        return comparePageButton;
    }
}
