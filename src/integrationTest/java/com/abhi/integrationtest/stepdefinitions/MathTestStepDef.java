package com.abhi.integrationtest.stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.springframework.http.ResponseEntity;

import com.abhi.integrationtest.cofigurations.SampleApplicationTestContext;
import com.jayway.jsonpath.JsonPath;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MathTestStepDef extends SampleApplicationTestContext {

	static ResponseEntity<String> response;

	@When("^numbers (\\d+) and (\\d+) are added$")
	public void numbers_and_are_added(int arg1, int arg2) throws Throwable {
		String url = "http://localhost:"+serverPort+"/api/add?numberOne=" + arg1 + "&numberTwo=" + arg2;
		response = testRestTemplate.getForEntity(url, String.class);
		assertTrue("Wrong response code.Expected 200.Actual::" + response.getStatusCodeValue(),
				response.getStatusCodeValue() == 200);
	}

	@Then("^result should be (\\d+)$")
	public void result_should_be(int expectedResult) {
		int actualResult = (Integer) JsonPath.read(response.getBody(), "$.result");
		assertTrue("Wrong result.Expected::" + expectedResult + ".Actual::" + actualResult,
				actualResult == expectedResult);
	}
}
