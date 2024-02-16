package Listing_3;

 class Vehicle3_11 {
     int passengers;
     private int wheels;
     private int maxspeed;
     int burnup;

     Vehicle3_11(int passengers, int wheels, int maxspeed, int burnup) {
         this.passengers=passengers;
         this.setWeels(wheels);
         this.maxspeed=maxspeed;
         this.burnup=burnup;
     }
     double distance(double iterval){
         double val = this.maxspeed * iterval;
         return  val;
     }
     int getMaxspeed() {
         return  this.maxspeed;
     }
     int getWheels() {
         return this.wheels;
     }
     void setWeels(int wheels){

         if ((wheels < 1) || (wheels > 24)){
             System.out.println("Неверно указано число колёс.");
             return;
         }
         this.wheels=wheels;
     }
}

class  VehicleGetSetMethod{

    public static void main(String[] args){

        Vehicle3_11 ferrari = new Vehicle3_11(2, -2, 360, 12);
        System.out.println("Max скорость: "+ ferrari.getMaxspeed()+" км/ч");
        System.out.println("Число колёс:"+ferrari.getWheels());
        ferrari.setWeels(4);
        System.out.println("Число колёс (повторно): "+ferrari.getWheels());
    }
}
