import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class I18NManager {

    I18NCache hashmap = new I18NCache();
    private static I18NManager instance;

    private I18NManager(){}

    public static I18NManager getInstance(){
        if (instance==null){
            instance=new I18NManager();
        }
        return instance;
    }

    public String getValue(String line, String language) throws IOException {
        String linewanted = hashmap.get(line,language);
        if (linewanted==null) {
            Properties p = new Properties();
            p.load(new FileInputStream("src/main/resources/" + language + ".properties"));
            hashmap.put(line,language,p.getProperty(line));
            return p.getProperty(line);
        }
        else {
            return linewanted;
        }
    }
}
