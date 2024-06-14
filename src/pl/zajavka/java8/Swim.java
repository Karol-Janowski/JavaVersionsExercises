package pl.zajavka.java8;

@FunctionalInterface
public interface Swim {

    String someMethodToImplementByLambda();

    default String canSwin() {
        return "No i cant swin";
    }

    static void someMethod() {
        System.out.println("calling static method");
    }
}
