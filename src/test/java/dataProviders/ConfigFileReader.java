package dataProviders;

import java.io.*;
import java.util.Properties;

public class ConfigFileReader {

    private static final String ENVIRONMENT = null;
    private static Properties properties;


    static {
          try (InputStream input = new FileInputStream("src/test/resources/config-"+ "test" + ".properties")) {
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }


}
