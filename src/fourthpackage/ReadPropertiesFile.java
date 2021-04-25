package fourthpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        //

        InputStream inputStream = new FileInputStream("JavaFirstProject/src/fourthpackage/config.properties");

        properties.load(inputStream);
        String dbNameFile = properties.getProperty("dbName");


    }
}
