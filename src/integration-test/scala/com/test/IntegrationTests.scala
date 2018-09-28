package com.test

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
	features = Array("src/integration-test/resources/features"),
	glue = Array("com.test.steps")
)
object IntegrationTests {
	
}