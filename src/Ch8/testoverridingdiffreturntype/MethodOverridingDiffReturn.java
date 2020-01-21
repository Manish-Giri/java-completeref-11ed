package Ch8.testoverridingdiffreturntype;

class A {
    int a;
    A(int n) {
        a = n;
    }

    int squareA() {
        return a*a;
    }
}

class B extends A {
    int b;
    B(int n) {
        super(n);
    }

    //@Override
    // with the String param, this becomes an overloaded method
    // not an overriden one
    int squareA(String msg) {
        System.out.println(msg);
        return super.squareA();
    }
}

public class MethodOverridingDiffReturn {
    public static void main(String[] args) {

        A a = new A(5);
        System.out.println(a.squareA());

        B b = new B(10);
        System.out.println(b.squareA("A message"));
    }
}


/*
25
A message
100
 */