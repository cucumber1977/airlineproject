$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("airline.feature");
formatter.feature({
  "line": 1,
  "name": "Ticket Booking Application",
  "description": "",
  "id": "ticket-booking-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6470471600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Test if the flights are available from any two destination",
  "description": "",
  "id": "ticket-booking-application;test-if-the-flights-are-available-from-any-two-destination",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the ticket booking website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify the text",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I search for flights from Abu Dhabi",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I search for flights to Accra",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on show flights",
  "keyword": "Then "
});
formatter.match({
  "location": "AirlineSteps.iAmOnTheTicketBookingWebsite()"
});
formatter.result({
  "duration": 180276400,
  "status": "passed"
});
formatter.match({
  "location": "AirlineSteps.iVerifyTheText()"
});
formatter.result({
  "duration": 71945100,
  "status": "passed"
});
formatter.match({
  "location": "AirlineSteps.iSearchForFlightsFromAbuDhabi()"
});
formatter.result({
  "duration": 295817600,
  "status": "passed"
});
formatter.match({
  "location": "AirlineSteps.iSearchForFlightsToAccra()"
});
formatter.result({
  "duration": 398680600,
  "status": "passed"
});
formatter.match({
  "location": "AirlineSteps.iClickOnShowFlights()"
});
formatter.result({
  "duration": 629332400,
  "status": "passed"
});
formatter.after({
  "duration": 794995400,
  "status": "passed"
});
});