package Listing_3;

 class Vehicle3_1  {
    int passengers; //кол-во пассажиров
    int wheels; //кол-во колёс
    int maxspeed; // максимальная скорость
    int burnup; // расход топлива
}

class VehicleDemo  {
    public static void main(String[] args){
        Vehicle3_1 car1= new Vehicle3_1();
        car1.passengers = 2; //кол-во пассажиров
        car1.wheels = 6; //кол-во колёс
        car1.maxspeed=130; //максимальная скорость км/ч
        car1.burnup= 30; //расход топлива на 100 км

        // расчёт пути, проходимого за полчаса при движении с максимальной скоростью
        double distance = car1.maxspeed*0.5;
        System.out.println("За полчаса Car1 может проехать "+distance+" км.");
        car1=null;
    }

}