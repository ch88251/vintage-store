package com.cfhayes.isbn;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.hasKey;

@QuarkusTest
public class IsbnResourceTest {

    @Test
    public void testIsbnNumbers() {
        given()
          .when().get("/api/v1/isbn")
          .then()
             .statusCode(200)
             .body("ISBN_13", startsWith("13-"))
             .body("ISBN_10", startsWith("10-"))
             .body(not(hasKey("generationDate")));
    }

}