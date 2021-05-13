public enum Sentences {

    JUNIT_IN_ACTION("JUnit in action"),
        SOME_PARAMETER("some parameter"),
    THREE_PARAMETERS("hello my world");

    private final String sentence;

    Sentences(String sentence) {
        this.sentence = sentence;
    }

    public String value() {
        return sentence;
    }
}
