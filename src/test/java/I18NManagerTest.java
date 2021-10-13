import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class I18NManagerTest {
    I18NManager manager;
    @Before
    public void SetUp(){
        manager = null;
    }

    @Test
    public void TestEs() throws IOException {
        String value = manager.getInstance().getValue("k1","es");
        Assert.assertEquals("Hola",value);
        value = manager.getInstance().getValue("k1","en");
        Assert.assertEquals("Hello",value);
        value = manager.getInstance().getValue("k2","ca");
        Assert.assertEquals("Bon dia",value);
        value = manager.getInstance().getValue("k2","ge");
        Assert.assertEquals("Guten Morgen",value);
        value = manager.getInstance().getValue("k1","en");
        Assert.assertEquals("Hello",value);
    }

    @Test
    public void TestGe() throws IOException {
        String value = manager.getInstance().getValue("k1","ge");
        Assert.assertEquals("Hallo",value);
    }

}
