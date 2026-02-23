package test.DesignPatterns.SingletonPattern;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestSpecTest {

    @Test
     public void createUser(){
         Response response = RestAssured.given()
                 .spec(RequestSpecManager.getRequestSpec())
                 .body("{\"name\": \"Google\"}")
                 .when()
                 .post("/api/users");

         Assert.assertEquals(response.getStatusCode(),201);

     }
}
