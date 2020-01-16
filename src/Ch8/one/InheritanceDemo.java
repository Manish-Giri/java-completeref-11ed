package Ch8.one;

class A implements TestInheritance{
    int i,  j;

    void showIJ() {
        System.out.println("In class A showIJ(), i and j = " + i + " " + j);
    }
}

class B extends A {
    int i = 6;
    int k;

    @Override
    void showIJ() {
        System.out.println("In class B showIJ(), i and j = " + i + " " + j);
    }

    void showK() {
        System.out.println("in class B, k = " + k);
    }

    void showSum() {
        System.out.println("In class B, i + j + k = " + (i + j + k));
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        A superObj = new A();
        superObj.i = 10;
        superObj.j = 5;


        B subObj = new B();

        superObj.showIJ();
        subObj.showK();

//      superObj.i = 10;
//      superObj.j = 5;
        superObj.showIJ();
        subObj.showIJ();
        subObj.showSum();
    }
}
