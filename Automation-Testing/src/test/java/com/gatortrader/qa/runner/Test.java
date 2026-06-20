package com.gatortrader.qa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "",
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/cucumber-html-report.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        }
)
public class Test {

}
