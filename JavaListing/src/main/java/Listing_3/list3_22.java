package Listing_3;

abstract class Shape3_22 {
    abstract double area();
}

class Point extends Shape3_22 {
    public String toString() {return "Точка";}
    double area() {return 0;}
}

class Triangle extends Shape3_22 {
    int cathetus1;
    int cathetus2;

    Triangle(int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }
    public String toString() {return "Треугольник";}

        double area() {
            return ((cathetus1 * cathetus2) / 2.0);
        }
    }

    class Circle extends Shape3_22 {
        int radius;

        Circle(int radius) {
            this.radius = radius;
        }

        public String toString() {
            return "Круг";
        }

        double area() {

            return ((radius * radius) * 3.14);

        }
    }

    public class list3_22 {

    public static void main (String[] args) {

        Point p = new Point();
        Triangle t = new Triangle(5, 3);
        Circle c = new Circle(9);
        Shape3_22[] s = {p, t, c};

        System.out.println("Расчёт площади фигур");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString() + " :" + s[i].area());
        }
    }
}