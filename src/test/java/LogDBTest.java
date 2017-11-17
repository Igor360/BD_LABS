import LAB2.ConnectionMongo;
import LAB2.LogsDB;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class LogDBTest {
    ConnectionMongo conn = null;
    boolean isConnected = false;
    @Before
    public void init(){
        try {
            conn = new ConnectionMongo("BD_LABS", "Logs");
            isConnected = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test(){
        Assert.assertNotNull(LogsDB.getIP(conn.getCollection(),"yandex.ru"));
        Assert.assertNotNull(LogsDB.getURL(conn.getCollection(),60, 70));
        Assert.assertNotNull(LogsDB.getURL(conn.getCollection(), "11.22.32.22"));
    }
}
