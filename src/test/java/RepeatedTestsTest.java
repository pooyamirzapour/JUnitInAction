import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestReporter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedTestsTest {
    private static Set<Integer> set= new HashSet<>();
    private static List<Integer> list= new ArrayList<>();

    @RepeatedTest(value = 5,name = "{displayName}")
    void addNumber()
    {
        Calculator calculator =new Calculator();
        assertEquals(2,calculator.add(1,1));
    }

    @RepeatedTest(value = 5,name = "{displayName}")
    void addToCollection(TestReporter testReporter, RepetitionInfo repetitionInfo)
    {
        set.add(1);
        list.add(repetitionInfo.getCurrentRepetition());
        testReporter.publishEntry("Repetition  number"
                ,String.valueOf(repetitionInfo.getCurrentRepetition()));
        assertEquals(1,set.size());
        assertEquals(repetitionInfo.getCurrentRepetition(),list.size());
    }
}
