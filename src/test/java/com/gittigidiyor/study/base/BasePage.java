package com.gittigidiyor.study.base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage {
    WebDriver driver;
    JavascriptExecutor javascriptExecutor;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public Actions getActions(){
        return new Actions(driver);
    }

    public void hoverElement(By locator){
        getActions().moveToElement(driver.findElement(locator)).build().perform();
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator, String text){
        find(locator).sendKeys(text);
    }

    //Kontrol amaçlı bir fonksiyon çoğunlukta hangi sayfada olduğumu görmek için kullandım
    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    //Sayfanın aşağısına inmek için
    public JavascriptExecutor scrollDown(){
        javascriptExecutor =((JavascriptExecutor)driver);
        return javascriptExecutor;
    }

    public void selectElement(By locator, String value) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(value);
    }

    public void clickElementsRandom(By locator){
        Random random = new Random();
        List<WebElement> products = findAll(locator);
        for (int i = 0; i < 4; i++) {
            int a = random.nextInt(products.size());
            try{
                products.get(a).click();
                products.remove(a);
                Thread.sleep(1000);
            }
            catch (Exception exception)
            {
                javascriptExecutor.executeScript("arguments[0].click();", products.get(a));
            }
        }
    }

    public void navigateTo() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://www.gittigidiyor.com/");
    }

    //Bekleme için yazdığım fonksiyon
    public void wait(int i, By locator){
        WebDriverWait wait = new WebDriverWait(driver,i);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitList(int i, By locator){
        WebDriverWait wait = new WebDriverWait(driver,i);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void newTab(String tabName){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(tabName);
    }
}
