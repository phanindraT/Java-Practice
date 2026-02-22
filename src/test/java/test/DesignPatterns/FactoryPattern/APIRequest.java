package test.DesignPatterns.FactoryPattern;

import io.restassured.specification.RequestSpecification;

public interface APIRequest {

    RequestSpecification createRequest();

}
