package src.latihanPackage.latihanAnonymousClass;

import java.util.Scanner;

public class ShowroomApp {

    static String pembayaran(){
        Scanner input =new Scanner(System.in);
        System.out.println("silahkan pilih metode pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 167_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.println("terimakasih telah belanja di showroom kami");
        } else if (bayar.equals("kredit")) {
            String[] kredit = {
                    "6 bulan",
                    "12 bulan",
                    "15 bulan",
                    "20 bulan",
                    "30 bulan"

            };
            System.out.println("==== berikut adalah rincian kredit ====");
            for (var i = 0; i < kredit.length; i++) {
                System.out.println((i+1)+". "+kredit[i]);
            }
        }
        return "terimakasih telah mengujungi Showroom kami ";
    }


    static void toyota(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan kisaran harga mobil yang diinginkan : ");
        int inputHarga = input.nextInt();
        if(inputHarga<200_000_000){
            System.out.println("===== Berikut harga Mobil yang tersedia untuk kisaran harga yang anda mau =====");
            String[] daftarMobil = {
                    "Avanza","Agya","Cayla"
            };
            for (var a = 0;a< daftarMobil.length;a++){
                System.out.println((a+1)+". "+daftarMobil[a]);


            }
            System.out.print("silahkan pilih mobil yang anda mau : ");
            int choseCar = input.nextInt();
            if (choseCar==1){
                pembayaran();
            }


        }
    }

    public static void main(String[] args) {
        Showroom brand = new Showroom() {

            public void mobil() {
                System.out.println(" daftar brand mobil yang tersedia ");
                System.out.println("1. Toyota");
                System.out.println("2. Honda");
                System.out.println("3. Bmw");
                Scanner input = new Scanner(System.in);
                System.out.println(
                        "masukan brand yang anda inginkan : "
                );
                int inputBrand = input.nextInt();
                if (inputBrand == 1){
                    toyota();
                }
            }
        };
        brand.mobil();
    }





}
