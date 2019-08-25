package com.abhi.integrationtest.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features = {"src/integrationtest/java/com/abhi/integrationtest/features"},
		  glue = "com.abhi.integrationtest.stepdefinitions",
		  tags = {"@IntegrationTest"},
		  plugin = {
		    "junit:target/cucumber.xml",
		    "json:target/cucumber.json",
		    "html:target/cucumber-reports"
		  }
		)
public class TestRunner {

}
