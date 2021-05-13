import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Iterator;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTestsTest {
    private PositiveNumberPredicate positiveNumberPredicate= new PositiveNumberPredicate();

    @BeforeAll
    static void setUpClass()
    {
        System.out.println("@BeforeAll method");
    }

    @AfterAll
    static void tearDownClass()
    {
        System.out.println("@AfterAll method");
    }

    @BeforeEach
     void setUp()
    {
        System.out.println("@BeforeEach method");
    }

    @AfterEach
     void tearDown()
    {
        System.out.println("@AfterEach method");
    }

    @TestFactory
    Iterator<DynamicTest> positiveNumberTest()
    {
        return Arrays.asList(
                dynamicTest("negative",()-> Assertions.assertFalse(positiveNumberPredicate.check(-1))),
                        dynamicTest("positive",()-> Assertions.assertTrue(positiveNumberPredicate.check(1))),
                        dynamicTest("zero",()-> Assertions.assertFalse(positiveNumberPredicate.check(0)))
        ).iterator();
    }


}
