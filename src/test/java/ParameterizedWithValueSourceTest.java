import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedWithValueSourceTest {
    private WordCount wordCount = new WordCount();

    @ParameterizedTest
    @ValueSource(strings = {"check the mails", "in action"})
    void testWordsSentence(String sentence) {
        assertEquals(3, wordCount.countWord(sentence));
    }



}
