package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(tags = "@smokeTest or @regression"
        , features = "src/test/resources/features/UsersManagement.feature"
        , glue = "com.definitions")
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
