package test.DesignPatterns.FactoryPattern;

import io.restassured.specification.RequestSpecification;

public class RequestFactory {
    public  static RequestSpecification getRequest(String type){

        if(type.equalsIgnoreCase("GET")){
            return  new GetRequest().createRequest();
        }else if(type.equalsIgnoreCase("POST")){
            return new PostRequest().createRequest();
        }
        else
            throw new IllegalArgumentException("Unknown request type");

    }
}
