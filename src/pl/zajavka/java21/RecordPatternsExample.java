package pl.zajavka.java21;

public class RecordPatternsExample {
    private void print(Object object) {
        if (object instanceof Point(int x, int y)) {
            System.out.printf("object is a point, x = %s, y = %s", x, y);
        }
    }
}
