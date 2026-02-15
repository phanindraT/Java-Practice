import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserSchemaTest {

    @Test
    public void validateUserSchema(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";

        RestAssured.given().when().
                get("/users/2").
                then().log().all().statusCode(200)
        .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/userSchema.json"));


    }
}
