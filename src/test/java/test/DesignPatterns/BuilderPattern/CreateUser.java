package test.DesignPatterns.BuilderPattern;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CreateUser {

    @Test(description = "using builder design pattern for building request payload")
   public  void createUser(){

        User requestBody = new User.Builder()
                .setName("google")
                .setEmail("google@gmail.com")
                .build();
        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post()
                .then()
                .extract()
                .response();
        System.out.println("--- builder pattern response -----"+response.getStatusCode());


    }

    @Test(description = "using lombok(which generates Builder Pattern code) for building request payload")
    public  void createNewUser(){

        NewUser requestBody =  NewUser.builder()
                .name("google")
                .email("google@gmail.com")
                .build();
        /* No new
        No setName
        Just .name() and .email() */

        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post()
                .then()
                .extract()
                .response();
        System.out.println("--- builder pattern response for Lombok-----"+response.getStatusCode());

    }

}
