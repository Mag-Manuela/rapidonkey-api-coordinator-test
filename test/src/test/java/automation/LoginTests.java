package automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports"},
        features = "src/main/resources/features",
        glue = "automation/glue/",
        tags= {"@validLogin or @invalidLogin or @empty or @activate"},    // based on tags scenarios will run
        monochrome=true, dryRun=false
)
public class LoginTests {
    @Test
    public void tests(){}
}
