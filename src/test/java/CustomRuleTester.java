import org.junit.Rule;
import org.junit.Test;

public class CustomRuleTester {

    @Rule
    public CustomRule rule = new CustomRule();

    @Test
    public void myCustomRuleTest() {
        System.out.println("call of a test method");
    }
}
