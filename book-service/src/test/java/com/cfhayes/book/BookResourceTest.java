package com.cfhayes.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
public class BookResourceTest {

    @Test
    public void shouldCreateABook() {
        given()
          .formParam("title", "Learning Quarkus")
          .formParam("author", "John Doe")
          .formParam("year", 2020)
          .formParam("genre", "Software")
          .when().post("/api/v1/books")
          .then()
             .statusCode(201)
             .body("title", is("Learning Quarkus"))
             .body("author", is("John Doe"))
             .body("year_of_publication", is(2020))
             .body("genre", is("Software"))
             .body("creation_date", startsWith("20"))
             .body("isbn_13", startsWith("13-"));
    }

}
