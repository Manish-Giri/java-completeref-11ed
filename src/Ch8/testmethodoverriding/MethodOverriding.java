package Ch8.testmethodoverriding;

class A {
    int i,j;
    A (int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("In class A, i and j : " + i + " " + j);
    }
}

class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("In class B, i and j: " + i + " " + j);
        System.out.println("and k: " + k);
    }
}

class MethodOverriding {

    public static void main(String[] args) {
        A a = new A(10, 20);
        a.show();

        B b = new B(9,9,9);
        b.show();

        a = b;
        // even tho superclass (a) reference is used for subclass (b) object
        // when subclass method (B.show) it can still access k, even though k is not
        // defined in class A
        a.show();

        // this however won't work
        //System.out.println(a.k);
    }
}
