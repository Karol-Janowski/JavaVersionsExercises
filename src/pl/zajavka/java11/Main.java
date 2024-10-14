package pl.zajavka.java11;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // LTS - Long Term Support - dluzsze wsparcie
        // zmieniony model licencjonowania
        // dodanie nowych metod do Stringa
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println("  ".isBlank());
        // dodane .lines zwraca stream
        // dodane .repeat
        // dodane strip - dziala na wiecej bialych znakow - ogolnie uzywamy strip zamiast trim (ma wiekszy zakres)
        // stripTrailing stripLeading - usuwa biale znaki na poczatku i na koncu
        // ulepszenie varow - mozna wpisywac w funkcjach
        // dodane metody do klasy Files
        // Files.writeString Files.readString
    }
}
