package src;

import java.util.Scanner;

public class Super {
    /*
    * ini sakaligus cara untk mengatasi variabel/field overridding
    * ini contoh penggunaan kata kunci super dalam variabel,yaitu kita dapat mengakses variabel yang ada di class parent dengan menggunakan kata kunci super
     */
static class speed{
    int maxSpeed = 120;
}
static class car extends speed{
    int maxSpeed = 180;
    void display(){
        System.out.println("maximum speed : "+super.maxSpeed);
    }
}
/*
execute program atau unit test program
 */
static class test{
    public static void main(String[] args) {
        car extion = new car();
        extion.display();
    }
}



/*
ini contoh penggunaan kata kunci super dalam method,yaitu kita dapat membuat dengan kata kunci super untuk mengakses method yang ada pada parent class
 */

   static class person{
       void massage(){
           Scanner input = new Scanner(System.in);
           System.out.println("input your name : ");
           String inputUser = input.nextLine();
       }
   }

   static class student extends person{
       void massage(){
           Scanner input = new Scanner(System.in);
           System.out.println("you are student");
           System.out.println("plis fill your NIS : ");
           String inputUser = input.nextLine();
       }
       void display(){
           massage();
           super.massage();//ini adalah proses pengaksesan method dengan kata kunci super
       }
   }
   /*
   execute program/unit test program
    */
static class print{
       public static void main(String[] args) {
           student fill = new student();
           fill.display();
       }
   }




   /*
   di bawah ini adalah penggunaan kata kunci super dalam constructor di mana kita bisa mengakses field(constructor) yang ada di dalam parent class
    */
   static class animals{
       animals(){
           Scanner input = new Scanner(System.in);
           for (var i = 1;i<5;i++) {
               System.out.println(i+" pliss input some animals : ");
               String inputUser = input.nextLine();

           }

       }

   }

   static class getAnimals extends animals{
       getAnimals(){
           super();
       }
   }


   /*
   execute program atau unit test program
    */
   static class testAnimals{
       public static void main(String[] args) {
           getAnimals get = new getAnimals();
       }
   }



}


