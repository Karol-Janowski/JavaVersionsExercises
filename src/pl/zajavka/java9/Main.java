package pl.zajavka.java9;

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Java 9
        // Jshell - REPL (Read Evaluate Print Loop)
        // Metoda List.of(); - stworzenie listy w sposob jednolinijkowy
        // nalezy pamietac ze taka lista jest immutable
//        List<String> stringList = List.of("string1", "string2", "String3");
//        List<String> list2 = List.of();
//        list2.add("zajavka");
//        System.out.println(list2);
        // jak zmutowac te liste?
        List<String> list3 = new ArrayList<>(List.of("string1", "string2", "string3"));
        list3.add("zajavka");
        System.out.println(list3);
        // drugi sposob
        List<String> list4 = new ArrayList<>(Arrays.asList("string1", "string2", "string3"));
        list4.add("zajavka");
        System.out.println(list4);
        // Metoda Set.of();
        Set<String> strings = Set.of("1", "2", "3");
        System.out.println(strings.getClass());
        List<String> strings2 = new ArrayList<>(Set.of("1", "2", "3"));
        System.out.println(strings2.getClass());
        // Map.of() - pozwala na dodanie maks 10 par
        Map.of();
        // jak zrobic mutowalna?
        Map<Integer, String> integerStringMap = new HashMap<>(Map.of(1, "Karol"));
        integerStringMap.put(2, "milsozek");
        System.out.println(integerStringMap);
        // Map.ofEntries() - rozwiazanie problemu tych 10 entrisow
        Map<Integer, String> entriesMap = new HashMap<>(Map.ofEntries(
                Map.entry(1, "Karol"),
                Map.entry(2, "Miloszek")
        ));
        System.out.println(entriesMap);

        // do interfejsow zostala dodana metoda prywatna
        // BufferedReader
        // Metoda .or() dodana do Optionala

        String result = Optional.<String>ofNullable(null)
                .or(() -> Optional.ofNullable(null))
                .orElse("orElse");

        // .stream() dodany do Optionala

        List<Integer> result2 = Optional.<String>ofNullable(null)
                .stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        Optional.<String>ofNullable(null)
                .ifPresent(System.out::println);

        Optional.<String>ofNullable("abc")
                .ifPresentOrElse(Main::onPresent, Main::onEmpty);

//        System.out.print(result);

        // Streamy moga byc ordered albo unordered (przetwarzanie deterministyczne albo niedeterministyczne)
        // przykladowo stream z listy jest deterministyczny
        // a stream z Seta jest niedeterministyczny (jezeli nie jest sort po drodze)
        // stream z list jest ordered a z HashSeta jest nieordered
        // streamyt sekwencyjne - o takich dotychczas rozmawialismy (sa tez te parallel wielowatkowe)
        // .takeWhile()

        List<Integer> collect = List.of(1, 3, 5, 7, 8, 10, 12, 13, 15).stream()
                .takeWhile(element -> element < 5)
                .collect(Collectors.toList());
        System.out.println(collect);

        // iterate do streamow
        System.out.println("#1");
        IntStream.iterate(2, element -> element * element)
                .limit(4)
                .forEach(System.out::println);


        System.out.println("#2");

        //after java 9
        IntStream.iterate(2, element -> element <= 256, element -> element * element)
                .forEach(System.out::println);

        // Stream.ofNullable() - kiedy nie jestesmy pewni czy metoda nie zwroci nam nulla

//        System.out.println(Stream.of(null));
        System.out.println(Stream.ofNullable(null).count());
        System.out.println(Stream.ofNullable(1).count());

        // klasy anonimowe - diamond operator do klas abstrakcyjnych
        SomeAbstractClass<String> someAbstractClass = new SomeAbstractClass<>() {
            @Override
            void call(String p1, String p2) {
                System.out.println("Running: " + p1 + ", " + p2);
            }

        };

        someAbstractClass.call("1", "2");

        // Java modules = kolejna warstwa abstrakcji ponad paczkami
        // paczki grupuja klasy moduly grupuja paczki (paczka paczek)
        // tylko jeden modul per plik jar

    }

    private static void onPresent(String input) {
        System.out.println("Calling on present: " + input);
    }

    private static void onEmpty() {
        System.out.println("Caaling on empty");
    }

    void beforeJava9() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            System.out.println(reader.readLine());
        }
    }

    void afterJava9() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        try (reader) {
            System.out.println(reader.readLine());
        }
    }
}
