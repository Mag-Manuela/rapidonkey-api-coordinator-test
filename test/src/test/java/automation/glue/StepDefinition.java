package automation.glue;

import config.RunFrameworkConfiguration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.ContextConfiguration;
import utils.Constants;

import static utils.Constants.BASE_URL;

@ContextConfiguration(classes = RunFrameworkConfiguration.class)
public class StepDefinition {
    private WebDriver driver;

    RequestSpecification request;
    private  static  Response response;
    private  static  String  jsonString;

    @Given("^I land on Login Page")
    public void i_land_on_login_page(){
        RestAssured.baseURI  =  BASE_URL;
        request  =  RestAssured.given();
        request.header(Constants.HEADER_NAME,  Constants.HEADER_VALUE);
        request.auth()
                .preemptive()
                .basic(Constants.BASIC_AUTH_USERNAME, Constants.BASIC_AUTH_PASSWORD);
    }

    //Scenario 1

    @Then("^Field \"([^\"]*)\" shows Empty Error")
    public void field_shows_empty_error(String field){
        Assert.assertEquals(true, response.body().prettyPrint().contains("Bad credentials"));
    }


    //Scenario 2 and 3
    @Then("^Field \"([^\"]*)\" shows Invalid Error")
    public void field_shows_invalid_error(String field){
        Assert.assertEquals(401, response.getStatusCode());
    }




    //provide data
    @When("^I click on Login")
    public void i_click_on_login(){

        String body = String.format("grant_type=%s&password=%s&username=%s", Constants.GRANT_TYPE, Constants.PASSWORD, Constants.USERNAME);
        response = request.
                header("Content-Type", "application/x-www-form-urlencoded").
                body(body).
                post("/general/v1/oauth/token");

    }

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





}
