$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("storelocator.feature");
formatter.feature({
  "line": 2,
  "name": "storelocator",
  "description": "",
  "id": "storelocator",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@storelocator"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "verify storelocator with valid data",
  "description": "",
  "id": "storelocator;verify-storelocator-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on store locator",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter \"\u003cpostcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on find store",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I need to see stores related to my postcode",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "storelocator;verify-storelocator-with-valid-data;",
  "rows": [
    {
      "cells": [
        "postcode"
      ],
      "line": 10,
      "id": "storelocator;verify-storelocator-with-valid-data;;1"
    },
    {
      "cells": [
        "IG7 5NP"
      ],
      "line": 11,
      "id": "storelocator;verify-storelocator-with-valid-data;;2"
    },
    {
      "cells": [
        "IG2 6BX"
      ],
      "line": 12,
      "id": "storelocator;verify-storelocator-with-valid-data;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13349139900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "verify storelocator with valid data",
  "description": "",
  "id": "storelocator;verify-storelocator-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@storelocator"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on store locator",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter \"IG7 5NP\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on find store",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I need to see stores related to my postcode",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_HomePage()"
});
formatter.result({
  "duration": 2320434200,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocatorStepDef.i_click_on_store_locator()"
});
formatter.result({
  "duration": 6427650500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IG7 5NP",
      "offset": 9
    }
  ],
  "location": "StoreLocatorStepDef.i_enter(String)"
});
formatter.result({
  "duration": 359522000,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocatorStepDef.click_on_find_store()"
});
formatter.result({
  "duration": 9188502900,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocatorStepDef.i_need_to_see_stores_related_to_my_postcode()"
});
formatter.result({
  "duration": 88346800,
  "status": "passed"
});
formatter.before({
  "duration": 10265394500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "verify storelocator with valid data",
  "description": "",
  "id": "storelocator;verify-storelocator-with-valid-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@storelocator"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on store locator",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter \"IG2 6BX\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on find store",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I need to see stores related to my postcode",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_HomePage()"
});
formatter.result({
  "duration": 6180258100,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocatorStepDef.i_click_on_store_locator()"
});
formatter.result({
  "duration": 2375993600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IG2 6BX",
      "offset": 9
    }
  ],
  "location": "StoreLocatorStepDef.i_enter(String)"
});
formatter.result({
  "duration": 1894927900,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocatorStepDef.click_on_find_store()"
});
formatter.result({
  "duration": 3096818300,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocatorStepDef.i_need_to_see_stores_related_to_my_postcode()"
});
formatter.result({
  "duration": 1830013000,
  "status": "passed"
});
});