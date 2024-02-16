package Listing_2;

public class list2_20 {
    public static void main(String[] args){

        for (int i=1; i<4; i++){

            Блок1:{
              Блок2:{
                Блок3:{

                  System.out.println("\ni равно "+i);
                  if (i==1) break Блок1;
                  if (i==2) break Блок2;
                  if (i==3) break Блок3;

                  System.out.println("123123123");

                }//Блок3
                  System.out.println("Завершён Блок3");
             }//Блок2
                System.out.println("Завершён Блок2");
            }//Блок1
            System.out.println("Завершён Блок1");
        }// for
        System.out.println("Конец цикла");



    }
}
