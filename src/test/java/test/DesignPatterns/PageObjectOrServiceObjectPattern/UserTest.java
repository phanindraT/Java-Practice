package test.DesignPatterns.PageObjectOrServiceObjectPattern;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends  BaseTest{

    UserService userService = new UserService();

    @Test
    public void createUserTest(){
        String payload  ="{\"name\":\"google\",\"job\":\"SearchEngine\"}";
        Response response = userService.createUser(payload);
        Assert.assertEquals(response.getStatusCode(),201);
        Assert.assertEquals(response.jsonPath().getString("name"),"google");
     }

}
