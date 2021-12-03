package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {
    By searchBoxLocator = new By.ByCssSelector("input[data-cy='header-search-input']");
    By searchButtonLocator = new By.ByCssSelector("button[data-cy='search-find-button']");

    public SearchBox(WebDriver driver) {
        super(driver);

    }

    public void search(String searchText){
        wait(3,searchBoxLocator);
        click(searchBoxLocator);
        type(searchBoxLocator,searchText);
        click(searchButtonLocator);
    }
}
