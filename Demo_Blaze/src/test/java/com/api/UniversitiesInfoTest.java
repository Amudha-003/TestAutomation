package com.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class UniversitiesInfoTest {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://universities.hipolabs.com";

		Response response = RestAssured.given().queryParam("country", "South Africa").get("/search");

		System.out.println(response.getBody().asString());

		JsonPath jsonPath = response.jsonPath();

		String stateProvince = jsonPath.getString("find { it.name == 'University of Witwatersrand' }.state-province");

		System.out.println("State-Province: " + stateProvince);
	}
}
