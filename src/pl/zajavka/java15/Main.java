package pl.zajavka.java15;

public class Main {
    public static void main(String[] args) {
        // wprowadzenie text blokow
        String input = """
                dupa
                """;

        System.out.println(gimmeHtml());

        String input3 = """
                zajavka: %s
                zajavka: %d
                """.formatted("hej", 3);

        // character escaping
        String input2 = "\\";
        System.out.println(input2);

        //preview
        //pattern matching instanceof
        // Rekordy
        // Sealed classes





    }

    static String gimmeHtml() {
        return """
                <html>\s
                    <body>
                        <div>zajavka!</div>
                    </body>
                </html>""";
    }
}
