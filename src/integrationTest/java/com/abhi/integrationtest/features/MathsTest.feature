@IntegrationTest
Feature: Integration Test Maths
	
	Scenario: Test Addition
		When numbers 1 and 2 are added
		Then result should be 3