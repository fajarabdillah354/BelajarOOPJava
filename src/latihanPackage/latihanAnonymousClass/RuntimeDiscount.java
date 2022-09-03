package src.latihanPackage.latihanAnonymousClass;

import java.util.Scanner;

public class RuntimeDiscount extends Error {
    public RuntimeDiscount(String message){
        super(message);
    }
    public static void runValidate(RunValidate validate) {
        if (validate.getKode() == null){
            throw new RuntimeException("KODE TIDAK BOLEH NULL");
        } else if (validate.getKode().isBlank()) {
            throw new RuntimeException("KODE TIDAK BOLEH KOSONG");
        } else if (validate.getKode() != "GNS354") {
            throw new RuntimeException("KODE YANG ANDA MASUKAN SALAH");
        }
    }

    public static class testValidate{

        public static void kuponDiscount(){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan kode discount : ");
            String inputDiscount = input.nextLine();
            if (inputDiscount == null || inputDiscount == "" ){
                throw new RuntimeDiscount("KODE ANDA DI TOLAK!!!!");
            } else if (inputDiscount.equals("GNS354")) {
                System.out.println("KODE SUKSES");
            }else {
                throw new RuntimeDiscount("KODE TIDAK TERSEDIA");

            }
        }



    }
}
