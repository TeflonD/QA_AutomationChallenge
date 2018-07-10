Feature: QA Automation Challenge

Scenario: Verify various scenarios

Given that the user has navigated to the Web Application URL
When title of the page is titled Where Experiences are Engineered - Valtech
Then the section at the bottom called Latest News should be displayed
Then user clicks on the About link and verifies that the H1 tag is displayed
Then the user clicks on the Services link and verifies that the H1 tag is displayed
Then the user clicks on Work link and verifies that the H1 tag is displayed
Then then user clicks on the About link
Then the user goes to the contact page and verifies the total location count
Then close the browser