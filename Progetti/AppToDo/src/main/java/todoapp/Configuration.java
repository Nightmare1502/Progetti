package todoapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private Properties props = new Properties();

    public Configuration() {
        try {
            InputStream inputStream = new FileInputStream(new File("config.properties"));
            props.load(inputStream);
        } catch (IOException e) {
            throw new IllegalStateException("Missing configuration file: config.properties");
        }
    }

    public Properties getProps() {
        return props;
    }

}