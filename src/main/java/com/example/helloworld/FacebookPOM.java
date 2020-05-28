package com.example.helloworld;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.example.helloworld.SeleniumDay3.driver;

public class FacebookPOM {


    @FindBy (id="u_0_m")
    private WebElement firstname;

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    @FindBy (id="u_0_o")

    private WebElement lastname;

    public FacebookPOM()
    {

        PageFactory.initElements(driver, this);
    }
    }
