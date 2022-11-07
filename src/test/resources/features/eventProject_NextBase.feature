@admin1
Feature: create an event by clicking Event tab under Activity Stream.
  User Story:
  As a user, I should be able to create events by clicking on Event tab under Activity Stream.

  @NEXTBASE-1394 @Pre-co
  Background: user is expected to be on login page
    Given user goes to login page
    And user enters valid username and password
    And user clicks on the Log in button
    And user clicks on the Event button

  @NEXTBASE-1414 @AllDay
  Scenario: Verify that as a user I should be able to add Event start and ending date and time,
            select "All day" and specify the time zone.
    When user selects a start and ending date and time
    Then user selects All day and specify the time zone

  @NEXTBASE-1415 @Reminder
  Scenario: Verify that as a user I should be able to set reminder.
    Then user should be able to click reminder and set to different times

  @NEXTBASE-1416 @Location
  Scenario: Verify that as a user I should be able to select the event location from the dropdown.
    Then user should be able to select a location from the dropdown

  @NEXTBASE-1417 @Contacts
  Scenario: Verify that as a user I should be able to add members
              by selecting contacts individually or adding groups and departments.
    Then user clicks on the Add persons, groups or department button to add contacts individually or add groups and departments.

  @NEXTBASE-1418 @MandatoryFields
  Scenario:  Verify that as a user I should be able to send event by filling the mandatory fields.
    Then user clicks on Send button to send the event

  @NEXTBASE-1474 @DeleteEvent
  Scenario: Verify that as a user I should be able to cancel sending event at any time before sending.
    When user clicks on "Send" button to send event
    And user goes to his|her event by clicking to "Calender" button and click on your event.
    Then click on "Delete" button.