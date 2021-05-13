import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

class TestReporterTest {

    @Test
    void a(TestReporter testReporter)
    {
        testReporter.publishEntry("Single value");
    }

     @Test
     void b(TestReporter testReporter)
     {
         testReporter.publishEntry("key","value");
     }

     @Test
     void c(TestReporter testReporter)
     {
         Map<String,String> map = new HashMap<>();
         map.put("user","john");
         map.put("password","secret");
         testReporter.publishEntry(map);
     }
}
