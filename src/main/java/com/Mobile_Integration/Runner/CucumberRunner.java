package com.Mobile_Integration.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },

        glue = "com/Mobile_Integration/StepDefs",
        features = "src/test/resources/features",
        dryRun=false,
        tags="@Regression",
        publish=true
)

public class CucumberRunner {

}
