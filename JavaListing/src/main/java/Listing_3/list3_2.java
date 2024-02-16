package Listing_3;

 class Vehicle3_2{
    int passengers; //кол-во пассажиров
    int wheels; //кол-во колёс
    int maxspeed; // максимальная скорость
    int burnup; // расход топлива
}

class MoreVehicleDemo {
    public static void main(String[] args) {


        Vehicle3_2 car1 = new Vehicle3_2();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;


        Vehicle3_2 bus1 = new Vehicle3_2();
        bus1.passengers = 2;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;
        // растояние за 1.25 часа при  макс скорости

        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;
        System.out.print("car1 может проехать за 1 час и 15 минут расстояние в ");
        System.out.print(distanceCar + "км с "+ car1.passengers);
        System.out.println(" пассажирами");
        System.out.print("bus1 может проехать за 1 час и 15 минут расстояние в ");
        System.out.print(distanceBus+"км с "+bus1.passengers);
        System.out.println(" пассажирами");


    }

}







