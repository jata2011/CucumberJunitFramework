package dataProviders;

import java.io.*;
import java.util.Properties;
import dataProviders.ConfigFileReader;
import utils.HelperClass;

import static utils.HelperClass.logger;
import static utils.HelperClass.varenvt;


public class ConfigFileReader {

    public ConfigFileReader(){
        varenvt = System.getenv("Environment");
        logger.info("env Value: " + varenvt);

    }

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
