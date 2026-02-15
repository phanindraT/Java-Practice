import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataDrivenTest {

       @DataProvider(name="userData")
       public Object[][] readData() throws IOException {
           List<String> lines = Files.readAllLines(Paths.get("src/test/resources/users.txt"));
           Object[][] data = new Object[lines.size()][1]; // here 1 denotes the number of parameters the calling method has.

           for(int i=0;i<data.length;i++){
               data[i][0]=lines.get(i);
           }
           return  data;

       }
    @DataProvider(name="userDataNew")
    public Object[][] readDataNew() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/test/resources/usersNew.txt"));
        Object[][] data = new Object[lines.size()][2]; // here 2 denotes the number of parameters the calling method has.

        for(int i=0;i<data.length;i++){
            String[] qa=lines.get(i).split(",");
            data[i][0]=qa[0].trim();
            data[i][1]=qa[1].trim();

        }
        return  data;

    }

       @Test(dataProvider = "userData")
       public  void testData(String username){
           System.out.println("username : "+username);

       }

    @Test(dataProvider = "userDataNew")
    public  void testDataNew(String username,String user){
        System.out.println("username : "+username);
        System.out.println("user : "+user);
    }

    }

