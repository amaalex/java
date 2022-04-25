import static org.junit.Assert.*;
import compulsory.*;
import org.junit.Test;

public class TestDatabase {

    @Test
    public void testConnection() {
        Database.createConnection();
        assertEquals(Database.getConnection()!=null, Database.getConnection());
    }
}
