package test.DesignPatterns.SingletonPattern;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager instance;
    private Properties properties;

    private ConfigManager(){
        try{
            FileInputStream fis = new FileInputStream("src/test/java/test/DesignPatterns/SingletonPattern/config.properties");
            properties = new Properties();
            properties.load(fis);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ConfigManager getInstance(){
        if(instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getBaseURI(){
        return  properties.getProperty("baseURI");
    }

}
