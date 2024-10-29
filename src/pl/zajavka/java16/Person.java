package pl.zajavka.java16;

public record Person(String NAME, String SURNAME, Long AGE) {
    public static final String COMMON = "COMMON";

    public static final int COUNTER;

    static {
        COUNTER = 100;
    }
}
