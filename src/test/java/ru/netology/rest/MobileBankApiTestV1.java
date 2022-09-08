package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {
    @Test
    void shouldReturnSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body ("data", equalTo ("data"))
                //.body(matchesJsonSchemaInClasspath("postmanecho.shema.json"))
        ;
    }
}
