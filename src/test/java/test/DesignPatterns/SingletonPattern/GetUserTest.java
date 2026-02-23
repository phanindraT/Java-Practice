package test.DesignPatterns.SingletonPattern;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class GetUserTest {
    public void getUserTest() {
        RestAssured.baseURI = ConfigManager.getInstance().getBaseURI();
        Response response = RestAssured.given()
                .header("x-api-key", "reqres_fc756d0a76394c44a7124b3e47884161")
                .header("content-type","application/json")
                .when()
                .get("/api/users");
        Assert.assertEquals(response.getStatusCode(), 200);

    }
}