Feature: Ticket Booking Application

  @smoke
  Scenario: Test if the flights are available from any two destination
    Given I am on the ticket booking website
    And I verify the text
    And I search for flights from Abu Dhabi
    And  I search for flights to Accra
    Then I click on show flights







