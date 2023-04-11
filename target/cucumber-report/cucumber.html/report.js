$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/filter.feature");
formatter.feature({
  "name": "Click on Shop By Filters and Verify",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Use Filters on Basis of Category Price and Brands",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "User goes on Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User Clicks on any of the Category Menu",
  "keyword": "And "
});
formatter.step({
  "name": "User Tries to Use Filters \"\u003cFilterType\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Selected Filters can be verified",
  "keyword": "Then "
});
formatter.step({
  "name": "Clear Filter is clicked",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FilterType"
      ]
    },
    {
      "cells": [
        "Category"
      ]
    },
    {
      "cells": [
        "Brands"
      ]
    },
    {
      "cells": [
        "Price"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Use Filters on Basis of Category Price and Brands",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User goes on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.useFilters.user_goes_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on any of the Category Menu",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.useFilters.user_clicks_on_any_of_the_category_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Tries to Use Filters \"Category\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.useFilters.user_Tries_to_Use_Filters(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selected Filters can be verified",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.useFilters.selected_filters_can_be_verified()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear Filter is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.useFilters.clear_filter_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Use Filters on Basis of Category Price and Brands",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User goes on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.useFilters.user_goes_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on any of the Category Menu",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.useFilters.user_clicks_on_any_of_the_category_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Tries to Use Filters \"Brands\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.useFilters.user_Tries_to_Use_Filters(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selected Filters can be verified",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.useFilters.selected_filters_can_be_verified()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear Filter is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.useFilters.clear_filter_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Use Filters on Basis of Category Price and Brands",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User goes on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.useFilters.user_goes_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on any of the Category Menu",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.useFilters.user_clicks_on_any_of_the_category_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Tries to Use Filters \"Price\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.useFilters.user_Tries_to_Use_Filters(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selected Filters can be verified",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.useFilters.selected_filters_can_be_verified()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear Filter is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.useFilters.clear_filter_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});