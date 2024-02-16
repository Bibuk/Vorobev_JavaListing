package Listing_3;

interface A {
    void metodA();
}

interface B extends A {
    void metodB();
}

class IExample3_24 implements B {

    public void metodA() {System.out.println("Метод А");}
    public void metodB() {System.out.println("Метод B");}
}

public class list3_24 {

    public static void main(String[] args) {

        IExample3_24 ie = new IExample3_24();
        ie.metodA();
        ie.metodB();
    }
}