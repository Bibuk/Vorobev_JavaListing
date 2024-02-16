package Listing_2;

public class list2_3 {
    public static void main (String[] args) {

    int a, b, c, d;

    a = 2;
    b = 3;

    System.out.println("а равно 2, b авно 3");
    if (a < b) System.out.println(" a меньше b");
    if (a > b) System.out.println(" этот текст вы никогда не увидите");

    System.out.println("");

    c = a - b; //с будет равно -1
    System.out.println("с равно -1");
    if (c >= 0) System.out.println("с имеет положительное значение");

    if (c < 0) System.out.println("c имеет отрицательное значение");
    System.out.println("");

    d = b - a; // d равно 1
    System.out.println("d имеет положительное значение");
    if (d >= 0) System.out.println("d имеет положительное значение");

    if (d < 0) System.out.println("d имеет отрицательное значение");

    System.out.println("");

    if (a + c != b) System.out.println("а плюс с не равняется b");
    if (a + d == b) System.out.println("а плюс d равняется b");

} // main() method
} // IfStatementDemo class

