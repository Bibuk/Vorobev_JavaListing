package Listing_3_25Fix;

public class list3_25Fix {
    public static void main(String[] args) {
        Auto3_25 a = new Auto3_25();
        Vehicle3_25 v = new Vehicle3_25();
        Vehicle3_25[] va = {a, v};
        for (int i = 0; i < va.length; i++){
            System.out.println(va[i].toString());
            if (va[i] instanceof Moveable) {
                Moveable m = (Moveable) va[i];
                m.move(10 + i * 34, 34);
            }
        }
    }
}

    interface Moveable {
        void move(int x, int y);
    }

    class Vehicle3_25 implements Moveable {
        public void move(int x, int y) {
            System.out.println("Vehicle3_25 moved to (" + x + ", " + y + ")");
        }
    }

    class Auto3_25 extends Vehicle3_25 {
        // Класс Auto3_25 наследует метод move от Vehicle3_25
    }

