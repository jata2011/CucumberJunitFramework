package dataProviders;

import java.io.*;
import java.util.Properties;
import static utils.HelperClass.varenvt;


public class ConfigFileReader {

    private static Properties properties;



    static {
          try (InputStream input = new FileInputStream("src/test/resources/config-"+ varenvt + ".properties")) {
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
