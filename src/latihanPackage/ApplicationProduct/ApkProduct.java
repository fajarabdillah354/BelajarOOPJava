package src.latihanPackage.ApplicationProduct;

import src.latihanPackage.DateZodiak.Product;
import src.latihanPackage.InputSome.InputDate;

public class ApkProduct {
    public static void main(String[] args) {
        /*
        SAAT KITA MENGAKSES OBJECT CONSTRUCTOR YANG ADA DI PACKAGE DATEZODIAK AKAN ERROR SEBELUM KITA MENGUBAH AKSES MODIFIERNYA,KITA MEMERLUKAN AKSES PUBLIC PADA CONSTRUCTORNYA
         */
        Product product = new Product("SONY",15_000_000);//setelah mengubah akses modifier dari default ke public maka sudah tidak error lagi
        System.out.println("nama product : "+product.name);//agar variabel nama bisa di akses di package yang berbeda harus di ubah akses modifiernya menjadi public
        System.out.println("nama product : "+product.price);



        /*
        mengakses package lain(inputSome)
         */
        InputDate input = new InputDate();
        input.getInput();


    }


}
