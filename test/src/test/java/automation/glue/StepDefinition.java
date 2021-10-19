package automation.glue;

import config.RunFrameworkConfiguration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.ContextConfiguration;
import utils.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.Constants.BASE_URL;

@ContextConfiguration(classes = RunFrameworkConfiguration.class)
public class StepDefinition {
    private WebDriver driver;

    RequestSpecification request;
    private  static  Response response;
    private  RequestSpecification requestForgotPassword;

    private  static  String  jsonString;
    private static String token;

    @Given("^I land on Login Page")
    public void i_land_on_login_page(){
        RestAssured.baseURI  =  BASE_URL;
        request  =  RestAssured.given();
        request.header(Constants.HEADER_NAME,  Constants.HEADER_VALUE);
        request.auth()
                .preemptive()
                .basic(Constants.BASIC_AUTH_USERNAME, Constants.BASIC_AUTH_PASSWORD);
    }

    //provide data
    @When("^I click on Login")
    public void i_click_on_login(){

        String body = String.format("grant_type=%s&password=%s&username=%s", Constants.GRANT_TYPE, Constants.PASSWORD, Constants.USERNAME);
        response = request.
                header("Content-Type", "application/x-www-form-urlencoded").
                body(body).
                post("/general/v1/oauth/token");

        token = Arrays.asList(response.asPrettyString().split("\"")).get(3);
        System.out.println(token);
    }

    //Scenario 1

    @Then("^Field \"([^\"]*)\" shows Empty Error")
    public void field_shows_empty_error(String field){
        Assert.assertEquals(401, response.getStatusCode());
    }


    //Scenario 2 and 3
    @Then("^Field \"([^\"]*)\" shows Invalid Error")
    public void field_shows_invalid_error(String field){
        Assert.assertEquals(401, response.getStatusCode());
    }

    //Scenario 4
    @Then("^There is no dispatcher account for this email address Error is displayed")
    public void there_is_no_dispatcher_for_this_email_address_error_is_displayed(){
        Assert.assertEquals(true, response.body().prettyPrint().contains("There is no dispatcher account for this email address"));
    }

    //Scenario 5
    @Then("^My account status is changed to active")
    public void my_account_status_is_changed_to_active(){
        response = request.auth().oauth2(token).patch("/dispatcher/v1/environments/" + Constants.ENVIRONMENT_ID_FOR_ACTIVATING_ACCOUNT + "/bo-users/"+ Constants.BOUSER_ID_FOR_ACTIVATING_ACCOUNT + "/activate");
        jsonString = response.asPrettyString();
        Assert.assertEquals(true, jsonString.contains("\"status\": \"ACTIVE\""));
    }

    //Scenario 6

    //CHECK STATUS 200 <=> OK -> USER LOGGED
    @Then("^I am logged into the platform")
    public void i_am_logged_into_the_platform(){
        Assert.assertEquals(200, response.getStatusCode());
    }

    //check json
//    @And("^I am directed to the Dashboard page")
//    public void i_am_directed_to_the_dashboard_page(){
//        jsonString = response.asString();
//        System.out.println(jsonString);
//    }

    //Scenario 7
    @When("^I click Forgot Password")
    public void i_click_forgot_password(){
        RestAssured.baseURI  =  BASE_URL;
        String body = String.format("\"email\"" + Constants.EMAIL);
        requestForgotPassword  =  RestAssured.given();
        System.out.println(Constants.HEADER_VALUE);
        requestForgotPassword.header(Constants.HEADER_NAME, Constants.HEADER_VALUE).contentType(ContentType.JSON);
        response = requestForgotPassword.body(body).
                post("/general/v1/oauth/forgot-password");
        System.out.println(response.getHeader("app-client"));
    }

    @Then("^I should start the Forgot Password funnel")
    public void i_should_start_the_forgot_password_funnel(){
        System.out.println(response.body().prettyPrint());
        Assert.assertEquals(true, response.body().prettyPrint().contains("\"message\": \"Successfully sent email to update password\""));
    }



}
