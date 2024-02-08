package com.exchangerate;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.hasKey;


public class Exchangerate {

    String url = "https://v6.exchangerate-api.com/v6/1fc80820c72b0163bc9c7536/latest/USD";

    Response response;

    @Before
    public void setUp() {
        response = given().accept(ContentType.JSON)
                .get(url).then().extract().response();
    }

    @Test
    public void test1() {
        response.then().statusCode(200);
    }

    @Test
    public void test2() {
        int count = response.path("conversion_rates.size()");
        System.out.println("Count the total number of currencies returned within the response: " + count);
    }

    @Test
    public void test3() {
        response.then().body("conversion_rates", hasKey("GBP"));
    }



}
