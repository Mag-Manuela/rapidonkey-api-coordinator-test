package automation.glue;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import config.RunFrameworkConfiguration;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import cucumber.api.java.Before;
import org.springframework.test.context.ContextConfiguration;
import utils.Constants;
import utils.Log;
import utils.TestCases;
import utils.Utils;

import static utils.Constants.BASE_URL;

@ContextConfiguration(classes = RunFrameworkConfiguration.class)
public class ForgotPasswordStepDefinition {
    RequestSpecification request;
    private  static Response response;
    private  RequestSpecification requestForgotPassword;
    ExtentTest test;
    static ExtentReports report = new ExtentReports("report/TestReport.html");
    private String testName;

    private  static  String  jsonString;
    private static String token;

//    @Before
//    public void initialize(){
////        TestCases[] tests = TestCases.values();
////        testName = tests[Utils.testCount].getTestName();
////        test = report.startTest(testName);
////        System.out.println(testName);
////        Log.getLogData(Log.class.getName());
////        Log.startTest(testName);
//        //Utils.testCount++;
//    }

    @Given("^I land on Forgot password")
    public void i_land_on_forgot_password(){
        RestAssured.baseURI  =  BASE_URL;
        request  =  RestAssured.given();
        request.header(Constants.HEADER_NAME,  Constants.HEADER_VALUE);
        request.auth().none();
        test.log(LogStatus.PASS, "Entered Forgot Password page");
    }

    @When("^I click on Submit")
    public void i_click_on_submit(){
        String body = String.format("\"email\" :" + Constants.EMAIL);
        response = request.header("Content-Type", "application/json;charset=UTF-8").body(body).
                post("/general/v1/oauth/forgot-password");
        test.log(LogStatus.PASS, "Navigating to " + BASE_URL + "/general/v1/oauth/forgot-password");
    }

    @Then("^I see the Success message")
    public void i_see_the_success_message(){
        if(response.getStatusCode() == 200)
            test.log(LogStatus.PASS, "Successfully sent email to update password");
        else
            test.log(LogStatus.FAIL, "Email was not sent successfully for updating the password.");
        Assert.assertEquals(true, response.body().prettyPrint().contains("\"message\": \"Successfully sent email to update password\""));
    }

//    @After
//    public void closeObjects(){
//        report.endTest(test);
//        Log.endTest(testName);
//        report.flush();
//    }

}
