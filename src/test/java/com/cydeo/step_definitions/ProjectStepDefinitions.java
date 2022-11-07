package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectStepDefinitions {

    @Given("user goes to login page")
    public void userGoesToLoginPage() {
        System.out.println("user goes to login page");
    }

    @And("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        System.out.println("user enters valid username and password");
    }

    @And("user clicks on the Log in button")
    public void userClicksOnTheLogInButton() {
        System.out.println("user clicks on the Log in button");
    }

    @And("user clicks on the Event button")
    public void userClicksOnTheEventButton() {
        System.out.println("user clicks on the Event button");
    }

    @When("user selects a start and ending date and time")
    public void userSelectsAStartAndEndingDateAndTime() {
        System.out.println("user selects a start and ending date and time");
    }

    @Then("user selects All day and specify the time zone")
    public void userSelectsAllDayAndSpecifyTheTimeZone() {
        System.out.println("user selects All day and specify the time zone");
    }

    @Then("user should be able to click reminder and set to different times")
    public void userShouldBeAbleToClickReminderAndSetToDifferentTimes() {
        System.out.println("user should be able to click reminder and set to different times");
    }

    @Then("user should be able to select a location from the dropdown")
    public void userShouldBeAbleToSelectALocationFromTheDropdown() {
        System.out.println("user should be able to select a location from the dropdown");
    }

    @Then("user clicks on the Add persons, groups or department button to add contacts individually or add groups and departments.")
    public void userClicksOnTheAddPersonsGroupsOrDepartmentButtonToAddContactsIndividuallyOrAddGroupsAndDepartments() {
        System.out.println("user clicks on the Add persons, groups or department button to add contacts individually or add groups and departments.");
    }

    @Then("user clicks on Send button to send the event")
    public void userClicksOnSendButtonToSendTheEvent() {
        System.out.println("user clicks on Send button to send the event");
    }


    @When("user clicks on {string} button to send event")
    public void userClicksOnButtonToSendEvent(String arg0) {
        System.out.println("user clicks on {string} button to send event");
    }

    @And("user goes to his|her event by clicking to {string} button and click on your event.")
    public void userGoesToHisHerEventByClickingToButtonAndClickOnYourEvent(String arg0) {
        System.out.println("user goes to his|her event by clicking to {string} button and click on your event.");
    }

    @Then("click on {string} button.")
    public void clickOnButton(String arg0) {
        System.out.println("click on {string} button.");
    }


}


