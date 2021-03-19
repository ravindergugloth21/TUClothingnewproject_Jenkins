package com.runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
features = "./src/test/resources/features",
glue = {"com.stepdef"},
//tags= "@storelocator",
plugin={"html:target/cucumber-html-report", "json:target/cucumber.json"}


)

public class CucumberRunnerTest {

}
