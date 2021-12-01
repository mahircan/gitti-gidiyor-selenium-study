package com.gittigidiyor.study.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BagePage {
    WebDriver driver;
    JavascriptExecutor javascriptExecutor;

    public BagePage(WebDriver driver){
        this.driver = driver;
    }


}
