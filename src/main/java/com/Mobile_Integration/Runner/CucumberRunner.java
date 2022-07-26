package com.Mobile_Integration.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/Mobile_Integration/StepDefs",
        features = "src/test/resources/features",
        dryRun=false,
        tags="@MEQA-16",
        publish=true
)

public class CucumberRunner {

}
