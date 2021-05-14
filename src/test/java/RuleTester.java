import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RuleTester {
    @Rule
    public TemporaryFolder folder= new TemporaryFolder();
    private  static File createdFolder;
    private  static File createdFile;

    @Test
    public void testTempFolder() throws IOException
    {
        createdFolder= folder.newFolder("createdFolder");
        createdFile= folder.newFile("createdFile.txt");
        assertTrue(createdFolder.exists());
        assertTrue(createdFile.exists());
    }

    @AfterClass
    public static void cleanUpAllAfterTestsRun()
    {
        assertFalse(createdFolder.exists());
        assertFalse(createdFile.exists());
    }
}
