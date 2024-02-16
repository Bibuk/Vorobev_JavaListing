package Listing_3.Listing_3_10Fix;

 class Vehicle3_10 {
  int passengers;
  int wheels;
  private int maxspeed;
  int burnup;

  Vehicle3_10(int passengers, int wheels, int maxspeed, int burnup) {

   this.passengers = passengers;
   this.wheels = wheels;
   this.maxspeed = maxspeed;
   this.burnup = burnup;
  }
double distance(double interval){
   double val = this.maxspeed * interval;
   return val;
}

}

class VehicleAccessDemo{
 public static void main(String[] args){

  Vehicle3_10 ferrari = new Vehicle3_10(2, 4, 360, 12);

  double distance = ferrari.distance(0.5);
  System.out.println("Ferrari за полчаса проедет"+distance+" км.");
  //System.out.println("Скорость Ferrari:"+ferrari.maxspeed+" км/ч");  // эта команда вызывает ошибку компеляции. В файле list3_10Fix я попробовал это исправить и исправил. Код компилируется без ошибки.
 }
}