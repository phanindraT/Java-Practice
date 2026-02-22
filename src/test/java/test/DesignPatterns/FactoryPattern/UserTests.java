package test.DesignPatterns.FactoryPattern;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTests {

    @Test
    public  void testGetUser(){
        RequestSpecification request = RequestFactory.getRequest("GET");
        Response response = request.when().get("/users/1");
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test
    public void testPostUser(){
        RequestSpecification request = RequestFactory.getRequest("POST");
        Response response = request.when().post("/api/users");
        Assert.assertEquals(response.getStatusCode(),201);
    }
}
