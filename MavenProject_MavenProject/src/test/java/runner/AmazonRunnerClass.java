package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featurefile"},
        glue = {"stepdefinition"},
        tags = "@StaticDropdown",
        plugin = {"pretty","html:target/cucumberreport.html","json:target/reprt.json","junit:target/reprt.xml"}


)
public class AmazonRunnerClass {
}
