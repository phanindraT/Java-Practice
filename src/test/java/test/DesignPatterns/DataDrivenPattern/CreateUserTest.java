package test.DesignPatterns.DataDrivenPattern;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateUserTest {
    UserService userService = new UserService();

    @Test(dataProvider ="userData", dataProviderClass = TestDataProvider.class)
    public void createUserTest(String name, String email, String gender, String status){

        UserRequest userRequest = new UserRequest(name,email,gender,status);
        Response response = userService.createUser(userRequest);
        System.out.println("Response : "+response.asPrettyString());
        Assert.assertTrue(response.getStatusCode() == 201 || response.getStatusCode() == 422);

    }

    @Test(dataProvider ="userDataforPOJO", dataProviderClass = TestDataProvider.class)
    public void createUserTestUsingPOJO(UserRequest userRequest){
        System.out.println("***** using POJO ***** ");
        Response response = userService.createUser(userRequest);
        Assert.assertEquals(response.getStatusCode(),201);
    }
}
