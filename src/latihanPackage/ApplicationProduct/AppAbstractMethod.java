package src.latihanPackage.ApplicationProduct;

import src.latihanPackage.DateZodiak.AbstractMethod;
import src.latihanPackage.DateZodiak.ChildAbstractMethod;

public class AppAbstractMethod {
    /*
    ini adalah tempat pemanggilan object abstract class dan abstract method
     */
    public static void main(String[] args) {
        AbstractMethod test = new ChildAbstractMethod();//tipe data yang digunakan akan menggunakan abstract class lalu objectnya mengakses ke class child
        test.name = "fajar";
        test.getName();

    }
}
