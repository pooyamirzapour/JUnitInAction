import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(CustomTestRunner.class)
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        long add = calculator.add(5, 6);
        assertEquals(11, add);
    }

    @Override
    public String toString() {
        return "CalculatorTestPooya";
    }
}
