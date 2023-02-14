package com.example.prueba_cloudblue;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://creative-badger-sy9jme-dev-ed.trailblaze.lightning.force.com/one/one.app");

        mainPage = new MainPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void search() {
        mainPage.UsernameFormControl.sendKeys("test.qa.cloudblue@gmail.com");
        mainPage.PasswordFormControl.sendKeys("T3stQ4CB2023");
        mainPage.LoginInfo.click();

    }

}

