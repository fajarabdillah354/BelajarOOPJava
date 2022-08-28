package src.latihanPackage.ApplicationInterface;

import src.latihanPackage.Interface.Inherance1;

import java.util.Scanner;



public class InheranceImple implements Inherance1 {
    /*
   ini adalah overrride untuk method getBrand1 pada Inheranceinterface
 */
    public void name1(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama mobil : ");
        String getMobil = input.nextLine();
        System.out.println("mobil "+getMobil+" dengan harga "+dateCar1());
        System.out.println("brand : "+getBrand1());
        System.out.println("QUANTITY : "+stock1());
        System.out.println("========================================");

    }

    public int dateCar1(){
        int a = 300_000_000;
        System.out.println("harga mobil : "+a);
        return a;
    }

    public String getBrand1(){
        return "Mitsubisi";
    }


    /*
         INI ADALAH OVERRIDE UNTUK getBrand2
     */
    public void name2(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama mobil : ");
        String getMobil = input.nextLine();
        System.out.println("mobil "+getMobil+" dengan harga "+dateCar2());
        System.out.println("brand : "+getBrand2());
        System.out.println("QUANTITY : "+stock2());
        System.out.println("=============================================");



    }

    public int dateCar2(){
        int a = 700_000_000;
        System.out.println("harga mobil : "+a);
        return a;
    }

    public String getBrand2(){
        return "Toyota";
    }

    /*
     Ini OVERRIDE UNTUK getBrand3
     */

    public void name3(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama mobil : ");
        String getMobil = input.nextLine();
        System.out.println("mobil "+getMobil+" dengan harga "+dateCar3());
        System.out.println("brand : "+getBrand3());
        System.out.println("QUANTITY : "+stock3());
        System.out.println("===========================================");
    }


    public int dateCar3(){
        int a = 900_000_000;
        System.out.println("harga mobil : "+a);
        return a;
    }
    public String getBrand3(){
        return "Honda";


    }

    // OVERRIDE UNTUK getBrand4



    public void name4() {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama mobil : ");
        String getMobil = input.nextLine();
        System.out.println("mobil "+getMobil+" dengan harga "+dateCar4());
        System.out.println("brand : "+getBrand4());
        System.out.println("QUANTITY : "+stock4());
        System.out.println("===========================================");
    }

    public int dateCar4(){
        int a = 470_000_000;
        System.out.println("harga mobil : "+a);
        return a;
    }


    public String getBrand4() {
        return "Nissan";
    }
}
