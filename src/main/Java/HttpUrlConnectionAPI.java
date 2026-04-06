import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Using HttpURLConnection (built-in Java)
public class HttpUrlConnectionAPI {
    public static void main(String[] args) {
        try {

            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            String jsonInputString =  "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

            try(OutputStream os = conn.getOutputStream()){
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input,0,input.length);
            }

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code : "+responseCode);

            // Read response and print
            try(java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream(),"utf-8"))){
                StringBuilder response = new StringBuilder();
                String responseLine;
                while((responseLine = br.readLine())!=null){
                    response.append(responseLine.trim());
                }
                System.out.println("Response  : "+response);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
