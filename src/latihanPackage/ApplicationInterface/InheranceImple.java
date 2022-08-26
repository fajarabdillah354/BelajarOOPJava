package src.latihanPackage.ApplicationInterface;

import src.latihanPackage.Interface.Inherance1;

import java.util.Scanner;

public class InheranceImple implements Inherance1 {
    public void name1(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama mobil : ");
        String getMobil = input.nextLine();
        System.out.println("mobil "+getMobil+" dengan harga "+dateCar1());
        System.out.println("brand : "+getBrand1());
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

    public void name2(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama mobil : ");
        String getMobil = input.nextLine();
        System.out.println("mobil "+getMobil+" dengan harga "+dateCar2());
        System.out.println("brand : "+getBrand2());
    }

    public int dateCar2(){
        int a = 700_000_000;
        System.out.println("harga mobil : "+a);
        return a;
    }

    public String getBrand2(){
        return "Toyota";
    }



}
