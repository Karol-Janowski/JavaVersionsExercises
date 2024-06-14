package pl.zajavka;

@Deprecated(forRemoval = true, since = "12.11.2025")
public class DeprecatedClass {

    private String name;

    @Deprecated
    void someMethod() {
        System.out.println(this.name);
    }

    void nonDepreactedMethod() {

    }
}
