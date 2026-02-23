package test.DesignPatterns.SingletonPattern;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecManager {

    private  static RequestSpecification requestSpec;
    private RequestSpecManager(){

    }
    public static RequestSpecification getRequestSpec(){
        if(requestSpec == null){
            requestSpec = new RequestSpecBuilder().setBaseUri(ConfigManager.getInstance().getBaseURI())
                    .addHeader("content-type","application/json")
                    .addHeader("x-api-key", "reqres_fc756d0a76394c44a7124b3e47884161")
                    .build();
        }
        return requestSpec;
    }
}
