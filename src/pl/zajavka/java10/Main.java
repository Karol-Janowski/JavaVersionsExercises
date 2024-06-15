package pl.zajavka.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // var
        // var mozna uzywac tylko w scopie lokalnym - nie mozna uzywac jako pola w klasie
        // nie mozna uzywac vara w kontekscie typow generycznych
        // nie mozna uzywac do typow zwracanych z metody
//        Map<String, Map<String, List<String>>> result = someMap();

        Consumer<String> variable = System.out::println;

        var result = someMap();
        var a = 1;
        var b = 2;
        var c = 3;

        Object newA = (Object) a ;
        System.out.println(newA.getClass());

        // do kolekcji dodano List.copyOf()

        List<String> food = new ArrayList<>();
        food.add("Banana");
        food.add("Apple");
        food.add("Orange");
        System.out.println("Original " + food);

        List<String> foodCopied = List.copyOf(food);
//        foodCopied.add("Pineapple"); tak nie mozna

        // Optional
        Optional<String>
    }

    private static Map<String, Map<String, List<String>>> someMap() {
        return null;
    }
}
