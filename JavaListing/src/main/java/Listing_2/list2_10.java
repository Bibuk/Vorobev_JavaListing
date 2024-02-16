package Listing_2;

public class list2_10 {
    public static void main(String[] args) {
        // эти переменные инициализируются константами
        double radius = 4; // радиус цилиндра
        double height = 5; // высота цилиндра

        // переменная volume инициализируется динамически
        // вычисленным значением выражения
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Объем цилиндра равен " + volume);
    }
}

