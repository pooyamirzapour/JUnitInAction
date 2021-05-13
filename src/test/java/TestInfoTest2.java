import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.TestInfo;
import static org.junit.jupiter.api.Assertions.*;

public class TestInfoTest2 {

     TestInfoTest2(TestInfo testInfo) {
        assertEquals("TestInfoTest2",testInfo.getDisplayName());
    }

    @BeforeEach
    void setUp(TestInfo testInfo)
    {
        String displayName = testInfo.getDisplayName();
        assertTrue(displayName.equals("display name of the method")
        ||
                        displayName.equals("testGetNameOfTheMethod2(TestInfo)")
        );
    }

    @Test
    @DisplayName("display name of the method")
    void testGetNameOfTheMethod(TestInfo testInfo)
    {
        assertEquals("display name of the method", testInfo.getDisplayName());
    }

    @Test
    void testGetNameOfTheMethod2(TestInfo testInfo)
    {
        String displayName = testInfo.getDisplayName();
        assertEquals(displayName, testInfo.getDisplayName());
    }

}
