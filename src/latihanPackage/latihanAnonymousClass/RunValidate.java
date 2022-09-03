package src.latihanPackage.latihanAnonymousClass;

import java.util.Scanner;

public class RunValidate {
    private String kode;

    public String code(String kode){
        this.kode = kode;
        return this.kode;
    }
//    public RunValidate(String kode){
//        this.kode = kode;
//    }
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }


    public static void inputUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kode discount : ");
        String inputDiscount = input.nextLine();

    }
}
