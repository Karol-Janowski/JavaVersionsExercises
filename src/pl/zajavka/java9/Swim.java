package pl.zajavka.java9;

public interface Swim {

    static void someMethod() {
        areYouReady();
    }

    private static boolean areYouReady() {
        return true;
    }
}
