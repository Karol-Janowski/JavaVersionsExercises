package pl.zajavka.java16;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // rekordy - nosnik danych, klasy ktore przetrzymuja dane
        // public, package-private
        // klasa immutable - nie ma setterow
        // sa generyki
        // metody dostepowe - nei gettery
        // modeling data as data - z dokumentacji
        // java disassembler - javap java.util.List w konsoli przykladowo
        // mozna definiowac stale nie mozna definiowac zmiennych
        // mozna implementowac interfejsy
        // konstruktor kompaktowy
        Person person = new Person("Karol", "Janowski", 28L);

        // nested inner classes
        // klasy zagniezdzone moga miec zmienne statyczne

        // pattern matching instanceof

        // Streamy - .collect(Collectors.toList) zastapiono .toList(); - nie ma gwarancji implementacji
        List<String> collect = Stream.of(1, 5, 71, 34)
                .map(Object::toString)
                .toList();

        System.out.println(collect);

        // Time
        LocalTime time1 = LocalTime.parse("7:00:00");
        LocalTime time2 = LocalTime.parse("15:00:00");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss B");
        System.out.println(dateTimeFormatter.format(time1));
        System.out.println(dateTimeFormatter.format(time2));

        //JPackage - przygtowanie paczki instalacyjnej

        // Sealed Classes - preview features - napisanie kto moze dziedziczyc z klasy

    }

    void method(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Cat is happy" + cat.mrr());

        }
    }

    void newInstanceof(Animal animal) {
        if (animal instanceof Cat cat) {
            System.out.println("Cat is happy" + cat.mrr());
        }
    }
}
