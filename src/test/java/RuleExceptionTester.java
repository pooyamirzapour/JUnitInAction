import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleExceptionTester {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Calculator calculator = new Calculator();

    @Test
    public void expectedIllegalArgumentException(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Hi this is IllegalArgumentException");

        calculator.sqrt(-5);
    }

    @Test
    public void expectedArithmeticException(){
        expectedException.expect(ArithmeticException.class);
            expectedException.expectMessage("Hi this is ArithmeticException");

        calculator.divide(10,0);
    }
}
