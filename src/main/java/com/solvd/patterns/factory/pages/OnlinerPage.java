package com.solvd.patterns.factory.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.patterns.factory.components.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class OnlinerPage extends AbstractPage {

    @FindBy(className = "g-top")
    private Header header;

    public OnlinerPage(WebDriver driver) {
        super(driver);
    }

    public void describe() {
        System.out.println("This is simple onliner page");
    }

    public Header getHeader() {
        return header;
    }
}
