package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    static {
        String dosyayolu="configurations.properties";

            try {
                FileInputStream fis=new FileInputStream(dosyayolu);
                properties = new Properties();
                properties.load(fis);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
