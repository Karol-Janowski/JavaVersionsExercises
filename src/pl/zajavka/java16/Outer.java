package pl.zajavka.java16;

public class Outer {

    class Inner {

        public static int a = 2;

        public void call() {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.call();

    }
}
