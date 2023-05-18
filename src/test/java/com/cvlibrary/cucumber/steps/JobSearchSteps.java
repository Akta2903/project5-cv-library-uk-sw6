package com.cvlibrary.cucumber.steps;

import com.cvlibrary.pages.HomePage;
import com.cvlibrary.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class JobSearchSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter jobtitle \"([^\"]*)\"$")
    public void iEnterJobtitle(String job)  {
        new HomePage().enterJobTitle(job);


    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
        new HomePage().enterLocation(location);

    }

    @And("^I enter distance \"([^\"]*)\"$")
    public void iEnterDistance(String distance)  {
        new HomePage().selectDistance(distance);

    }

    @And("^I click on more search option$")
    public void iClickOnMoreSearchOption() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter minimum \"([^\"]*)\"$")
    public void iEnterMinimum(String minSal)  {
        new HomePage().enterMinSalary(minSal);

    }

    @And("^I enter maximum salary \"([^\"]*)\"$")
    public void iEnterMaximumSalary(String maxSal)  {
        new HomePage().enterMaxSalary(maxSal);

    }

    @And("^I select salaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String salType)  {
        new HomePage().selectSalaryType(salType);

    }

    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobType)  {
        new HomePage().selectJobType(jobType);

    }

    @And("^click on find job button$")
    public void clickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I verify the result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result)  {
        Assert.assertEquals(result,new ResultPage().getResultMessage());

    }
}
