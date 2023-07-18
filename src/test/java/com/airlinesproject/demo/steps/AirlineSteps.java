package com.airlinesproject.demo.steps;

import com.airlinesproject.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AirlineSteps {

    @Given("^I am on the ticket booking website$")
    public void iAmOnTheTicketBookingWebsite() {

    }

    @When("^I search for flights from Abu Dhabi$")
    public void iSearchForFlightsFromAbuDhabi() {
        new HomePage().sendTextToFromField();
    }

    @And("^I search for flights to Accra$")
    public void iSearchForFlightsToAccra() {
        new HomePage().sendTextToToField();
    }

    @Then("^I click on show flights$")
    public void iClickOnShowFlights() {
        new HomePage().showFlights();
    }

    @And("^I verify the text$")
    public void iVerifyTheText() {
        Assert.assertEquals(new HomePage().assertMethod(), "Change the Way you Travel");
    }
}
