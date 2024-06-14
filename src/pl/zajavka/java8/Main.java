package pl.zajavka.java8;

public class Main {
    public static void main(String[] args) {
        // Java 8
        // Metody defaultowe w interfejsach ( wczesniej tylko public abstract)
        // Metody statyczne w interfejsach ( mozna wywolac tylko na interfejsie)
        // Nowe API DateTime (java.time...)
        // Programowanie funkcyjne (java.util.function) / Method Reference
        // Stream API (java.util.stream) / metoda stream() i parallelStream() -> wielowatkowosc
        // Optional / nullPointerException / opakowanie jakiejs wartosci
        // Operacje na plikach / Files.list() / Files.lines() / Files.walk()
        // Do kolekcji zostala dodana metoda forEach();
        Swim swim = () -> "Some Implementation";
        swim.someMethodToImplementByLambda();


    }
}
