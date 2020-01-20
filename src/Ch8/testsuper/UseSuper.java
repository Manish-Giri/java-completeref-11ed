package Ch8.testsuper;

class A {
    int i = 10;

    void show() {
        System.out.println("i in class A: " + i);
    }
}

class B extends A {

    // i hides the i in A
    int i;

    B (int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class UseSuper {

    public static void main(String[] args) {

        A a = new A();
        a.show();
        System.out.println("----");
        B b = new B(90, 95);
        b.show();

        a.show();

        b.show();
        System.out.println("----");
        A anotherA = new A();
        anotherA.show();


    }
}

/*
i in class A: 10
----
i in superclass: 90
i in subclass: 95
i in class A: 10
i in superclass: 90
i in subclass: 95
----
i in class A: 10
 */