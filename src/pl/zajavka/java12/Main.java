package pl.zajavka.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // preview features

        Pair collect = Stream.of(5, 1, 32, 12)
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.summingInt(element -> element),
                        (c1, c2) -> new Pair(c1, c2)
                ));

        // dwie nowe metody do String
        // indent() - modyfikuje wciecia w Stringu, mniejszy od zera zmniejsza znaki wiekszy dodaje

        String input = "###\n\tzajavka\n\t\tzajavka\n\t\tzajavka\n###";
        System.out.println(input);
        System.out.println(input.indent(-1));
        System.out.println(input.indent(0));
        System.out.println(input.indent(1));

        // transform()
        String input2 = "Hej zajavwkoicze! Co tam slychac?";
        Integer transform = input2.transform((element -> element.length()));
        System.out.println(transform);
    }

    static class Pair {
        Long count;
        Integer sum;

        public Pair(Long count, Integer sum) {
            this.count = count;
            this.sum = sum;
        }

        public Long getCount() {
            return count;
        }

        public Integer getSum() {
            return sum;

        }

    }


}
