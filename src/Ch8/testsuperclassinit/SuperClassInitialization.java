package Ch8.testsuperclassinit;

class A {
    int a;
    A() {
        System.out.println("Class A default constructor...");
    }
    A (int a) {
        System.out.println("Class A constructor..");
        this.a = a;
    }

    int squareA() {
        return a*a;
    }
}

class B extends A {
    int b;
    B (int b) {
        System.out.println("class B constructor...");
        //super(b);
    }
}
public class SuperClassInitialization {
    public static void main(String[] args) {
        A a = new A(5);
        System.out.println(a.squareA());
        System.out.println("-----");
        B b = new B(10);
        System.out.println(b.squareA());
    }
}

/*
Class A constructor..
25
-----
Class A default constructor...
class B constructor...
0
 */