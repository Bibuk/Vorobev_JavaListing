package Listing_2;

public class list2_12 {
    public static void main(String[] args) {
        int count=1;
        System.out.println("count = " + count);
        {
            count = 2; // count объявлена в main
            System.out.println("Первый независимый блок: count = " + count);
            int n = 3;
            System.out.println("Первый независимый блок: n = " + n);
        }
        // т.к переменная n создана в первом независимом блоке, она существует только внутри него.
        {
           int n = 5;// соответственно нукжно объявить переменную заново, во втором блоке
            System.out.println("Второй независимый блок: n = " + n);
        }
    }
}
