package Listing_3.Listing_3_10Fix;

class Vehicle3_10Fix {
    int passengers;
    int wheels;
    private int maxspeed;
    int burnup;
    Vehicle3_10Fix(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }

    public int getMaxSpeed() {  //Теперь getMaxSpeed() позволяет получить доступ к переменной maxspeed из внешнего класса, и код  успешно компилироваться.
        return maxspeed; //Ошибка компиляции происходила из-за того, что пытаясь обратиться к приватному полю maxspeed не в классе Vehicle3_10. А приватные поля могут быть доступны только внутри того же класса, где они были созданы.
    }
}

class VehicleAccessDemoFix {
    public static void main(String[] args) {
        Vehicle3_10Fix ferrari = new Vehicle3_10Fix(2, 4, 360, 12);
        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за полчаса проедет " + distance + " км.");
        System.out.println("Скорость Ferrari: " + ferrari.getMaxSpeed() + " км/ч");
    }
}
