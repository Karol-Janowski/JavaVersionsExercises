package pl.zajavka.java17;

public class Main {
    public static void main(String[] args) {
        // LTS
        // sealed classes - ograniczenie kto moze dziedziczyc z klasy bazowej
        // pattern matching for switch
    }

    private static void Method(Animal animal) {
        if (animal instanceof Cat cat) {
            System.out.println("Here is Cat");
        } else if (animal instanceof Dog dog) {
            System.out.println("Here is dog");
        } else if (animal instanceof Monkey monkey) {
            System.out.println("Here is Monkey");
        } else {
            System.out.println("no idea");
        }
    }

    private static void Method2(Animal animal) {
        switch (animal) {
            case Cat cat -> System.out.println("Here is Cat");
            case Dog dog -> System.out.println("Here is dog");
            case Monkey monkey -> System.out.println("Here is Monkey");
            case null, default -> System.out.println("no idea");
        }
    }
}
