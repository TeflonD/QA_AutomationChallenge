$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/KentoValashi/eclipse-workspace/QAAutomationChallengeProject/src/main/java/Features/QAAutomationChallenge.feature");
formatter.feature({
  "line": 1,
  "name": "QA Automation Challenge",
  "description": "",
  "id": "qa-automation-challenge",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify various scenarios",
  "description": "",
  "id": "qa-automation-challenge;verify-various-scenarios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "that the user has navigated to the Web Application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is titled Where Experiences are Engineered - Valtech",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the section at the bottom called Latest News should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the About link and verifies that the H1 tag is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user clicks on the Services link and verifies that the H1 tag is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on Work link and verifies that the H1 tag is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user clicks on the About link",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the user goes to the contact page and verifies the total location count",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "QAAutomationSteps.that_the_user_has_navigated_to_the_Web_Application_URL()"
});
formatter.result({
  "duration": 8347964870,
  "status": "passed"
});
formatter.match({
  "location": "QAAutomationSteps.title_of_the_page_is_titled_Where_Experiences_are_Engineered_Valtech()"
});
formatter.result({
  "duration": 51911032,
  "status": "passed"
});
formatter.match({
  "location": "QAAutomationSteps.the_section_at_the_bottom_called_Latest_News_should_be_displayed()"
});
formatter.result({
  "duration": 126257129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 53
    }
  ],
  "location": "QAAutomationSteps.user_clicks_on_the_About_link_and_verifies_that_the_H_tag_is_displayed(int)"
});
formatter.result({
  "duration": 1960458601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 60
    }
  ],
  "location": "QAAutomationSteps.the_user_clicks_on_the_Services_link_and_verifies_that_the_H_tag_is_displayed(int)"
});
formatter.result({
  "duration": 2353440092,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 52
    }
  ],
  "location": "QAAutomationSteps.the_user_clicks_on_Work_link_and_verifies_that_the_H_tag_is_displayed(int)"
});
formatter.result({
  "duration": 9396875634,
  "status": "passed"
});
formatter.match({
  "location": "QAAutomationSteps.then_user_clicks_on_the_About_link()"
});
formatter.result({
  "duration": 7422316565,
  "status": "passed"
});
formatter.match({
  "location": "QAAutomationSteps.the_user_goes_to_the_contact_page_and_verifies_the_total_location_count()"
});
formatter.result({
  "duration": 55815907,
  "status": "passed"
});
formatter.match({
  "location": "QAAutomationSteps.close_the_browser()"
});
formatter.result({
  "duration": 884369074,
  "status": "passed"
});
});