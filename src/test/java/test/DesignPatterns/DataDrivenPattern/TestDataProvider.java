package test.DesignPatterns.DataDrivenPattern;

import org.testng.annotations.DataProvider;
import test.DesignPatterns.BuilderPattern.User;

public class TestDataProvider {

    @DataProvider(name="userData")
    public Object[][] getUserData(){
        return new Object[][]{
                {"google","google@gmail.com","male","active"},
                {"salesforc","salesforce@salesforce.com","male", "active"},
                {"invalidUser","invalidEmail","male","active"},
                {"","noName@gmail.com","male","active"}
        };
    }


    @DataProvider(name ="userDataforPOJO")
    public Object[][] getUserDataforPOJO(){
        return new Object[][]{
                {new UserRequest("google","google@gmail.com","male","active")},
                {new UserRequest("salesforc","salesforce@salesforce.com","male", "active")},
                {new UserRequest("invalidUser","invalidEmail","male","active")},
                {new UserRequest("","noName@gmail.com","male","active")}
        };
    }
}
