package Listing_3;

 class SimpleVehicle {

     int passengers;
}

class RefTypes {
     public static void main(String[] args){

         SimpleVehicle car1,car2; //две ссылки на оъбект типа SimpleVehce
         car1 = new SimpleVehicle(); // создаём объкт и ссылку на него
         car2 = new SimpleVehicle();// car1 начинает ссылаться на объект, на который ссылается переменная car2, тем самым обе переменные ссылаются на один обЪект, что вызывало ошибку. Чтобы исправить ошибку я  создал новый объект для перемененой car2.

         car1.passengers=25; // кол-во пассажиров

        // обе переменные ссылаются на один объект
        car1=car2;
        //докажем это:
         System.out.println("Кол-во пассажиров car2 равно "+ car2.passengers);
         car2.passengers= 50;
         //Car2 и car1- это один и тот же объект, то теперь
         // car1.passengers стало равно 50
         System.out.println("Кол-во пассажиров car1 равно "+car1.passengers);
     }
}