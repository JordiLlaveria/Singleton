import java.io.IOException;

public class I18NManagerTest {
    public static void main(String[] args) throws IOException {
        I18NManager manager = null;
        String value = manager.getInstance().getValue("k1","en");
    }
}
