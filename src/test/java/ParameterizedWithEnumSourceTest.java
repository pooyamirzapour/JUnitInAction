import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedWithEnumSourceTest {

    private WordCount wordCount = new WordCount();

    @ParameterizedTest
    @EnumSource(Sentences.class)
    void testWord(Sentences sentences)
    {
        assertEquals(3,wordCount.countWord(sentences.value()));
    }

    @ParameterizedTest
    @EnumSource( value = Sentences.class , names = {"JUNIT_IN_ACTION","SOME_PARAMETER"})
    void testSelectedWord( Sentences sentences)
    {
        assertEquals(3,wordCount.countWord(sentences.value()));
    }

    @ParameterizedTest
    @EnumSource( value = Sentences.class , mode = EnumSource.Mode.EXCLUDE, names = {"JUNIT_IN_ACTION"})
    void testExcludedWord( Sentences sentences)
    {
        assertEquals(3,wordCount.countWord(sentences.value()));
    }

    @ParameterizedTest
    @CsvSource(  {"3, JUNIT_IN_ACTION"," 2 ,SOME_PARAMETER"})
    void testWordInSentence( int expected, Sentences sentences)
    {
        assertEquals(expected,wordCount.countWord(sentences.value()));
    }

}
