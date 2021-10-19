package automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "automation/glue/",
        tags= "@forgotPassword",    // based on tags scenarios will run
        monochrome=true, dryRun=false
)
public class LoginTests {
    @Test
    public void tests(){}
}
