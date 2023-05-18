package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    /*
    Locators - resultText
    Method - verifyTheResults(String expected)
*/
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='search-header__left']//h1")
    WebElement resultMessage;



    public String getResultMessage()
    {
        log.info("Getting the result Message displayed ");
        return getTextFromElement(resultMessage);
    }


}
