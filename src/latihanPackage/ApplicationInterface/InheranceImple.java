package src.latihanPackage.ApplicationInterface;

import src.latihanPackage.Interface.Inherance1;

import java.util.Scanner;

public class InheranceImple implements Inherance1 {
    public void name(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama mobil : ");
        String getMobil = input.nextLine();
        System.out.println("mobil "+getMobil+" harganya "+dateCar());
        System.out.println("brand : "+getBrand());
    }
    public int dateCar(){
        int a = 300_000_000;
        System.out.println("harga mobil : "+a);
        return a;
    }

    public String getBrand(){
        return "Mitsubisi";
    }
}
