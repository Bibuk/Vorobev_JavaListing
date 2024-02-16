package Listing_3;

class Vehicle3_4 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    void distance(double interval){
        double value=maxspeed*interval;
        System.out.println("пройдёт путь, равный "+ value + " km.");
    }
}

class VehicleMethodDemo{
    public static void main(String[] args){
        Vehicle3_4 car=new Vehicle3_4();
        car.passengers=2;
        car.wheels=4;
        car.maxspeed=130;
        car.burnup=30;

        Vehicle3_4 bus=new Vehicle3_4();
        bus.passengers=45;
        bus.wheels=4;
        bus.maxspeed=100;
        bus.burnup=25;

        double time = 0.5;
        System.out.print("автомобиль с " + car.passengers+ " пассажирами");
        car.distance(time);
        System.out.print("автобус с " + bus.passengers + " пассажирами");
        bus.distance(time);
    }
}

