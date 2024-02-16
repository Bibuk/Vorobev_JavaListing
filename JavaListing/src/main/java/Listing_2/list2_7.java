package Listing_2;
// вычисление длины гипотенузы по теореме Пифагора
public class list2_7 {
    public static void main(String[] args) {
        double cathetus1, cathetus2, hypot;

        cathetus1 = 3; // длина первого катета
        cathetus2 = 4; // длина второго катета

        hypot = Math.sqrt((cathetus1 * cathetus1) + (cathetus2 * cathetus2));

        System.out.println("длина гипотенузы равна " + hypot);
    }
}

