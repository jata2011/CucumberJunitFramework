package dataProviders;

import java.io.*;
import java.util.Properties;

import static utils.HelperClass.environmentFromYAML;

public class ConfigFileReader {

    private static Properties properties;


    static {
          try (InputStream input = new FileInputStream("src/test/resources/config-"+ environmentFromYAML + ".properties")) {
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
