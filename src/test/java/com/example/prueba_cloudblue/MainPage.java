package com.example.prueba_cloudblue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/
public class MainPage {
    @FindBy(css = "input[id='username']")
    public WebElement UsernameFormControl;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement PasswordFormControl;

    @FindBy(name = "Login")
    public WebElement LoginInfo;
    



    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
