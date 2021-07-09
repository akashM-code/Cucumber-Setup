package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/addweb/IdeaProjects/Cucumber_Setup/Features/Login.feature"},
        glue = {"stepDefinitions"},
        plugin = {"pretty","html:target/html-report.html","json:target/cucumber.json"},
        monochrome = true, // display the console output in proper readable format
        dryRun = true
)
public class runnerClass {

}
