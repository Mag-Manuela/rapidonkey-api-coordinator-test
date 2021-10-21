package automation.glue;

import config.RunFrameworkConfiguration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.test.context.ContextConfiguration;
import utils.Constants;

import static utils.Constants.BASE_URL;

@ContextConfiguration(classes = RunFrameworkConfiguration.class)
public class ResetPasswordStepDefinition {
    RequestSpecification request;
    private  static Response response;
    private  RequestSpecification requestForgotPassword;

    private  static  String  jsonString;
    private static String token;

    @Given("^I land on Reset password by opening the link received in the email")
    public void i_land_on_reset_password_by_opening_the_link_received_in_the_email(){
        RestAssured.baseURI  =  BASE_URL;
        request  =  RestAssured.given();
        request.header(Constants.HEADER_NAME,  Constants.HEADER_VALUE);

        request.auth()
                .preemptive()
                .basic(Constants.BASIC_AUTH_USERNAME, Constants.BASIC_AUTH_PASSWORD);
    }

    @When("^I click on Reset password")
    public void i_click_on_reset_password(){
        String body = "\"old_password\" : \"" + Constants.RESET_OLD_PASSWORD + "\", \n \"new_password\" :" + Constants.RESET_NEW_PASSWORD + "\"confirmation_password\" : \"" + Constants.RESET_CONFIRMATION_PASSWORD + "\"";

    }

    @Then("^\"The passwords don't match\" error is displayed")
    public void the_passwords_don_t_match_error_is_displayed(){

    }



}
