package Study.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test02 {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream rs = systemClassLoader.getResourceAsStream("prop.properties");

        System.out.println(rs);
        if (rs!= null){
            Properties prop = new Properties();
            prop.load(rs);
            System.out.println(prop);
            rs.close();
        }





    }
}
