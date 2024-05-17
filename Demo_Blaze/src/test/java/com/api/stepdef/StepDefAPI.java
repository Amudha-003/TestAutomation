package com.api.stepdef;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class StepDefAPI {

	JsonPath jsonPath = null;
	Response response = null;

	@Given("Add BaseUri")
	public void add_base_uri() {

		RestAssured.baseURI = "http://universities.hipolabs.com";
	}

	@When("Verify endpoint with Query params")
	public void verify_endpoint_with_query_params() {

		response = RestAssured.given().queryParam("country", "South Africa").get("/search");

		System.out.println(response.getBody().asString());

		jsonPath = response.jsonPath();
	}

	@Then("validate Response With ResponseCode {int} And With Response Value State as {string}")
	public void validate_response_with_response_code_and_with_response_value_state_as(int expectedStatusCode,
			String expectedState) {

		String stateProvince = jsonPath.getString("find { it.name == 'University of Witwatersrand' }.state-province");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(expectedStatusCode, statusCode);
		Assert.assertEquals(expectedState, stateProvince);
		System.out.println("State-Province: " + stateProvince);
		System.out.println("Response Code is : " + statusCode);

	}

}
