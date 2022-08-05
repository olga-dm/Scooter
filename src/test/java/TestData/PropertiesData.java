package TestData;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;


public class PropertiesData {
    public String name;
    public String surname;
    public String address;
    public String subway;
    public String numberPhone;
    public String time;
    public String term;
    public String colorScooter;
    public String comment;
    public PropertiesData(int id) {
        try (InputStream input = getClass()
                .getClassLoader()
                .getResourceAsStream(String.format("testdata.user%s.properties", id))) {

            InputStreamReader reader = new InputStreamReader(input, "UTF-8");
            Properties prop = new Properties();
            prop.load(reader);
            name = prop.getProperty("user.name");
            surname=prop.getProperty("user.surname");;
            address=prop.getProperty("user.address");;
            subway=prop.getProperty("user.subway");
            numberPhone=prop.getProperty("user.numberPhone");
            time=prop.getProperty("user.time");
            term=prop.getProperty("user.term");
            colorScooter=prop.getProperty("user.colorScooter");
            comment=prop.getProperty("user.comment");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
