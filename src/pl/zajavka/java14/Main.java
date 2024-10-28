package pl.zajavka.java14;

import java.util.Map;
import java.util.function.Function;

public class Main {


    public static void main(String[] args) {
        // nowy switch
        oldSwitch("C");
        newSwitch("E");
        newSwitchYield("Y");

        // przyjemniejszy zapis nullPointerException
        String input = null;
        String result = input.toString();

        // instanceOf
        String input2 = "";
        if (input instanceof String) {}

        // record jako preview feature (cos jak enum)

        // multiple String zostaly wprowadzone
        String input3 = """
                dupa 
                dupa 
                dupa
                """;

    }

    public static void oldSwitch(String input) {
        int result = 0;
        switch(input) {
            case "A":
            case "B":
            case "C":
                result = 1;
                break;
            case "D":
            case "E":
            case "F":
                result = 2;
                break;
        }
        System.out.println("Old switch: " + result);

        Map<String, Function<Integer, String>> map = Map.of(
                "A", value -> value.toString(),
                "B", value -> value.toString() + 2
        );
        map.get("A").apply(3);
    }

    public static void newSwitch(String input) {
        int result = switch(input) {
            case "A", "B", "C" -> 1;
            case "D", "E", "F" -> 2;
            default -> 0;
        };
        System.out.println("New switch: " + result);
    }

    public static void newSwitchYield(String input) {
        int result = switch(input) {
            case "A", "B", "C":
                yield 1;
            case "D", "E", "F":
                yield 2;
            default:
                yield 0;
        };
        System.out.println("New switch yield: " + result);
    }
}


