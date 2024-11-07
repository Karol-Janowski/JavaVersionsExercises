package pl.zajavka.java21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequencedCollectionsExample {
    void example1() {
        List<Integer> input = Arrays.asList(1, 5, 8);
        List<Integer> numbers = new ArrayList<>(input); // [1, 5, 8]

        numbers.addFirst(0); // [0, 1, 5, 8]
        numbers.addLast(10); // [0, 1, 5, 8, 10]

        Integer first = numbers.getFirst(); // 0
        Integer last = numbers.getLast(); // 10

        List<Integer> reversed = numbers.reversed(); // [10, 8, 5, 1, 0]
        System.out.println(reversed == numbers); // false
    }
}
