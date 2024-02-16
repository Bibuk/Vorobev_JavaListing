package Listing_3;

class ParaByValue3_12 {

    void callByVal (int x, int y){
        x = x + y;
        y = y + 1;
        System.out.println("Х = "+ x);
        System.out.println("Y = "+ y);
    }
}
class ParaByValueDemo {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;


        ParaByValue3_12 test = new ParaByValue3_12();
        test.callByVal(a,b);

        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}

