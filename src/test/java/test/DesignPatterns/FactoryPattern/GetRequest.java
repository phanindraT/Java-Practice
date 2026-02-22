package test.DesignPatterns.FactoryPattern;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;


    public  class GetRequest implements APIRequest {

        @Override
        public  RequestSpecification createRequest(){
            return RestAssured.given()
                    .baseUri("https://reqres.in/api")
                    .header("x-api-key", "reqres_fc756d0a76394c44a7124b3e47884161")
                    .header("content-type","application/json")
                    .log().all();
             }
    }

