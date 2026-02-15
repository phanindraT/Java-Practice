import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fileReadWrite {

    public static void main(String[] args) throws IOException {
        String requestBody = Files.readString(Paths.get("src/test/resources/schemas/new.json"));

        Response response = RestAssured.given().contentType(ContentType.JSON).body(requestBody).
                when().post("https://jsonplaceholder.typicode.com/posts");
        System.out.println("response : "+response.getStatusCode());

      try(FileWriter filewriter = new FileWriter("src/test/resources/schemas/qa.json")) {
          filewriter.write(String.valueOf(response.statusCode()));
      };
 //       filewriter.close();
        Files.write(Paths.get("src/test/resources/schemas/qa.json"), String.valueOf(response.getStatusCode()).getBytes());

    }
}


