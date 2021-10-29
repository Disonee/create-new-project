package ru_sapteh.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

    public String getProperties(String key) {
        String propertyValue = "";
        Properties properties = new Properties();

        try (FileReader reader = new FileReader("./src/main/resources/data_source.properties")) {
            properties.load(reader);
            propertyValue = properties.getProperty((key));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }
}
