$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Login.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "   In order to do internet banking\n   As a valid bank customer\n   I want to login successfully",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am in the login page of the ParaBank",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter valid \u003cusername\u003e and \u003cpassword\u003e with \u003cuserFullname\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I should be navigate  to the overview page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "userFullname"
      ]
    },
    {
      "cells": [
        "\"chetan\"",
        "\"chetan\"",
        "\"chetan pawar\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the login page of the ParaBank",
  "keyword": "Given "
});
formatter.match({
  "location": "com.parabank.steps.Steps.i_am_in_the_login_page_of_the_ParaBank() in file:/E:/Selenium/class-%20technogeeks/projects/Cucumber-Course/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"chetan\" and \"chetan\" with \"chetan pawar\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.parabank.steps.Steps.i_enter_valid_credential(String,String,String) in file:/E:/Selenium/class-%20technogeeks/projects/Cucumber-Course/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigate  to the overview page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.parabank.steps.Steps.i_should_be_navigate_to_the_overview_page() in file:/E:/Selenium/class-%20technogeeks/projects/Cucumber-Course/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});