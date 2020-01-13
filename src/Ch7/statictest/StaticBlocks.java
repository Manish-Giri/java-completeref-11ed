package Ch7.statictest;

public class StaticBlocks {
    private static int a = 3;
    private static int b;

    public StaticBlocks() {
        System.out.println("Constructor called...");
    }

    static {
        System.out.println("Static block called...");
        a *= 100;
        b = 20;
    }

    private static void staticMethod(int x) {
        System.out.println("x: " + x);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        System.out.println("main() called...");
        staticMethod(55);
    }
}
