$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/LogIn.feature");
formatter.feature({
  "name": "Users with valid credentials log in to Dispatcher App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Errors when any of the fields is empty",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@empty"
    }
  ]
});
formatter.step({
  "name": "I land on Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.step({
  "name": "Field \"\u003cfield\u003e\" shows Empty Error",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "field"
      ]
    },
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Errors when any of the fields is empty",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@empty"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I land on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.i_land_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Field \"email\" shows Empty Error",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.field_shows_empty_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Errors when any of the fields is empty",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@empty"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I land on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.i_land_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Field \"password\" shows Empty Error",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.field_shows_empty_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Errors when invalid field is wrong",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalidLogin"
    }
  ]
});
formatter.step({
  "name": "I land on Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.step({
  "name": "Field \"\u003cfield\u003e\" shows Invalid Error",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "field"
      ]
    },
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Errors when invalid field is wrong",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalidLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I land on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.i_land_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Field \"email\" shows Invalid Error",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.field_shows_invalid_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Errors when invalid field is wrong",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalidLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I land on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.i_land_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Field \"password\" shows Invalid Error",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.field_shows_invalid_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@activate"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I land on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.i_land_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My account status is changed to active",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.my_account_status_is_changed_to_active()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003ctrue\u003e but was:\u003cfalse\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat automation.glue.LoginStepDefinition.my_account_status_is_changed_to_active(LoginStepDefinition.java:141)\n\tat ✽.My account status is changed to active(src/main/resources/features/LogIn.feature:37)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@validLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I land on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.i_land_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am logged into the platform",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_am_logged_into_the_platform()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c200\u003e but was:\u003c401\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:645)\n\tat org.junit.Assert.assertEquals(Assert.java:631)\n\tat automation.glue.LoginStepDefinition.i_am_logged_into_the_platform(LoginStepDefinition.java:157)\n\tat ✽.I am logged into the platform(src/main/resources/features/LogIn.feature:44)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});