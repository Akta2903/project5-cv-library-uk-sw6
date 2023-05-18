package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    /*
  Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
    Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
    enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
    clickOnFindJobsButton().
   */
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleCv;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationCv;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobButn;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[text()='Accept All']")
    WebElement cookie;

    public void enterJobTitle(String jobTitle) {

        sendTextToElement(jobTitleCv, jobTitle);
        log.info("Enter Job title " + jobTitle.toString());
    }

    public void enterLocation(String location) {

        sendTextToElement(locationCv, location);
        log.info("Enter the Location " + location.toString());
    }

    public void selectDistance(String distance) {

        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        log.info("Select the distance " + distance.toString());
    }
    public void clickOnMoreSearchOptionLink(){

        clickOnElement(moreSearchOptionsLink);
        log.info("Click on more search option link " + moreSearchOptionsLink.toString());
    }
    public void enterMaxSalary(String maxSalary)
    {

        sendTextToElement(salaryMax,maxSalary);
        log.info("Enter the max salary " + maxSalary);
    }
    public void enterMinSalary(String minSalary)
    {

        sendTextToElement(salaryMin,minSalary);
        log.info("Enter the min salary " + minSalary);
    }
    public void selectSalaryType(String sType){

        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
        log.info("Select the salary type " + salaryTypeDropDown.toString());
    }
    public void selectJobType(String jobType){

        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        log.info("Select the Job type " + jobTypeDropDown.toString());
    }
    public void  clickOnFindJobsButton(){

        clickOnElement(findJobButn);
        log.info("Click on find jobs button " + findJobButn.toString());
    }


//    public void jobSearch(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result)
//    {
//
//        enterJobTitle(jobTitle);
//        enterLocation(location);
//        selectDistance(distance);
//        clickOnMoreSearchOptionLink();
//        enterMinSalary(salaryMin);
//        enterMaxSalary(salaryMax);
//        selectSalaryType(salaryType);
//        selectJobType(jobType);
//        clickOnFindJobsButton();
//
//
//
//    }

    public void clickOnAcceptCookies()
    {
        cookie.click();
    }

}
