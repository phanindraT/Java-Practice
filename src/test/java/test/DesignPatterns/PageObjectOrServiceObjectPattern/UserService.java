package test.DesignPatterns.PageObjectOrServiceObjectPattern;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/* This class handles:
Endpoint path
Request building
HTTP methods
It does NOT contain assertions.
*/

public class UserService {

    private  static final String BASE_PATH= "/api/users";

    public Response createUser(Object payload){
        return given().header("content-type","application/json")
                .header("x-api-key", "reqres_fc756d0a76394c44a7124b3e47884161")
                .body(payload)
                .when()
                .post(BASE_PATH);
    }

    public Response getUser(int userId){
        return  given().when()
                .get(BASE_PATH+"/"+userId);

    }

    public  Response updateUser(int userId, Object payload){
        return given().header("content-type","application/json")
                .body(payload)
                .when()
                .post(BASE_PATH+"/"+userId);
    }

    public Response deleteUser(int userId){
        return given().when()
                .delete(BASE_PATH+"/"+userId);

    }
}
