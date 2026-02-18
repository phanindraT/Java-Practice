import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class turvo {

    @BeforeClass
    public void setup(){
        RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
    }

    @Test
    public void SampleGetTest(){

        System.out.println("new class");
        Response response = RestAssured.given().when().get("posts/1");
        System.out.println("Status Code : "+response.getStatusCode());
        System.out.println("Response Body: "+response.prettyPrint());

        // We can fetch the data from response in different ways like below.

        //Use response.jsonPath()
        System.out.println("userId : "+response.jsonPath().get("userId"));

       //Chain directly from Rest Assured
        System.out.println("userId : "+RestAssured.given().when().get("https://jsonplaceholder.typicode.com/posts/1")
                     .then()
                    .extract().path("userId"));

        //Extract into a Java POJO (advanced)
        User user = response.as(User.class);
        System.out.println("userId through POJO:"+user.userId);

        Assert.assertEquals(response.getStatusCode(),200);

        // with Query Params / Path Params
         response = RestAssured
                .given()
                .queryParam("postId", 1)
                .when()
                .get("https://jsonplaceholder.typicode.com/comments");
         System.out.println("Query Params / Path Params : ");
         response.prettyPrint();
         Assert.assertEquals(response.getStatusCode(),200);

    }
    @Test
    public  void SampleGetPost(){
        // Those triple double quotes (""") are called text blocks, introduced in Java 15+.  If your Java version < 15, you cannot use triple quotes. You need to use normal strings with escaped quotes: String requestBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
        String requestBody ="""
        {
            "title": "Lead QA",
            "body": "Turvo NEW",
            "userId": 1
        }
        """;
        Response response = RestAssured.given().contentType(ContentType.JSON)
                .body(requestBody).when().post("https://jsonplaceholder.typicode.com/posts");
        System.out.println("Status Code : "+response.getStatusCode());
        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(),201);

//        RestAssured.given().log().all().contentType(ContentType.JSON)
//                .body(requestBody).when().post("https://jsonplaceholder.typicode.com/posts").then().log().all();

        /* We can send requestBody as Java object too (in .body(requestBody)).  REST Assured uses a library called:
Jackson (default) or Gson (if configured). This process is called Serialization. Converting Java Object → JSON
See builder patter for example. Getters Are Mandatory.
REST Assured uses Jackson internally to convert Java objects to JSON. Jackson serializes based on getter methods (getName(), getEmail(), etc.). Without getters, it throws FAIL_ON_EMPTY_BEANS error.

ex: public class CreateUserRequest {
    private String name;
    private String job;
}

And values are:
name = "Phani"
job = "SDET"

REST Assured converts it internally to:
{
  "name": "Phani",
  "job": "SDET"
}

That JSON is what actually goes in HTTP request body.

When Does This Work?
Automatic conversion works when:
You have Jackson dependency
Fields have getters (recommended)
OR fields are not private
OR you use Lombok @Data


*/

    }


}















