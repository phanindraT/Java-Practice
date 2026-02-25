package test.DesignPatterns.DataDrivenPattern;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserService {
    private  static final String BASE_PATH ="/users";

    public Response createUser(UserRequest requestBody){
        Response response = RestAssured.given()
                 .baseUri("https://reqres.in/api")
                .header("content-type","application/json")
                .header("x-api-key", "reqres_fc756d0a76394c44a7124b3e47884161")
                .body(requestBody)
                .when()
                .post(BASE_PATH)
                .then()
                .extract().response();
        return response;

    }

}
