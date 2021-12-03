package com.gittigidiyor.study.base;

import com.gittigidiyor.study.test.TestResultLogger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class) // Tüm testlere ekleyebilmek için Extendwith kullandık. Çünkü diğer testlerimizde BaseTest'ten extend ediyor.
public class BaseTest {

    protected WebDriver driver;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:/Users/testinium/IdeaProjects/gitti-gidiyor-selenium-study/src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.gittigidiyor.com/");

    }
     @AfterAll
     public void tearDown(){
       driver.quit();
      }
}
