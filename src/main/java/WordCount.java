import java.util.Arrays;

public class WordCount {

    public long countWord(String sentence)
    {
        String[] split = sentence.split(" ");
        return Arrays.stream(split).count();
    }
}
