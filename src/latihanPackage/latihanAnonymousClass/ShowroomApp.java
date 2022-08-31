package src.latihanPackage.latihanAnonymousClass;

import java.util.Scanner;

public class ShowroomApp {

/*
FUNCTION UNTUK PEMBAYARAN AGYA
 */
    static String pembayaranAgya(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih metode pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 170_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("Selamat anda telah membeli mobil Agya");
            } else if (beli.equals("deal")) {
                System.out.println("Selamat anda telah membeli mobil Agya");
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

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
        return " terimakasih ";
    }


/*
FUNCTION UNTUK PEMBAYARAN AVANZA
 */

    static String pembayaranAvanza(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih metode pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 167_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("Selamat anda telah membeli mobil Avanza");
            } else if (beli.equals("deal")) {
                System.out.println("Selamat anda telah membeli mobil Avanza");
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

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
        return " terimakasih ";
    }


/*
FUNCTION UNTUK PEMBAYARAN AYLA
 */

    static String pembayaranAyla(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih metode pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 150_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("Selamat anda telah membeli mobil Ayla");
            } else if (beli.equals("deal")) {
                System.out.println("Selamat anda telah membeli mobil Ayla");
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

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
        return "terimakasih  ";
    }


/*
FUCNTION PEMBAYARAN RUSH
 */

    static String pembayaranRush(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih metode pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 261_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("Selamat anda telah membeli mobil Rush");
            } else if (beli.equals("deal")) {
                System.out.println("Selamat anda telah membeli mobil Rush");
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

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
        return "terimakasih  ";
    }


/*
FUNCTION UNTUK PEMBAYARAN FREED
 */

    static String pembayaranFreed(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih metode pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 258_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("Selamat anda telah membeli mobil Freed");
            } else if (beli.equals("deal")) {
                System.out.println("Selamat anda telah membeli mobil Freed");
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

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
        return "terimakasih  ";
    }


/*
FUNCTION PEMBAYARAN RAIZE
 */

    static String pembayaranRaize(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih metode pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 275_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("Selamat anda telah membeli mobil Raize");
            } else if (beli.equals("deal")) {
                System.out.println("Selamat anda telah membeli mobil Raize");
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

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
        return "terimakasih  ";
    }


    /*
    DI BAWAH INI FUNCTION UNTUK BRAND MOBILNYA

    Yang pertama adalah Brand Toyota
     */
    static void Toyota(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan kisaran harga mobil yang diinginkan : ");
        int inputHarga = input.nextInt();
        if(inputHarga<200_000_000){
            System.out.println("===== BERIKUT MOBIL YANG TERSEDIA UNTUK KISARAN HARGA YANG ANDA INGINKAN =====");
            String[] daftarMobil = {
                    "Avanza","Agya","Ayla"
            };
            for (var a = 0;a< daftarMobil.length;a++){
                System.out.println((a+1)+". "+daftarMobil[a]);


            }
            System.out.print("SILAHKAN PILIH MOBIL YANG ANDA MAU : ");
            int choseCar = input.nextInt();
            if (choseCar==1){
                pembayaranAvanza();
            } else if (choseCar==2) {
                pembayaranAgya();
            } else if (choseCar==3) {
                pembayaranAyla();
            }else {
                System.out.println("!!!! MOBIL TIDAK TERSEDIA !!!!");
            }


        } else if (inputHarga>200_000_000) {
            System.out.println("==== BERIKUT MOBIL YANG TERSEDIA UNTUK KISARAN HARGA YANG ANDA INGINKAN ==== ");
            String[] daftarMobil = {
                    "Rush","Freed","Raize"
            };
            for (var i = 0;i< daftarMobil.length;i++){
                System.out.println((i+1)+". "+daftarMobil[i]);
            }
            System.out.print("SILAHKAN PILIH MOBIL YANG ANDA MAU : ");
            int choseMobil =input.nextInt();
            if (choseMobil == 1){
                pembayaranRush();
            } else if (choseMobil == 2) {
                pembayaranFreed();
            } else if (choseMobil == 3) {
                pembayaranRaize();
            }else {
                System.out.println("!!!! MOBIL TIDAK TERSEDIA !!!!");
            }
        }
    }

    /*
    di bawah ini Brand Honda
     */
    static void Honda(){

    }

    /*
    di bawah ini Brand Bmw
     */
    static void Bmw(){

    }

    /*
    DI BAWAH INI ADALAH MAIN PROGRAMNYA
     */
    public static void main(String[] args) {
        Showroom brand = new Showroom() {

            public void mobil() {
                System.out.println(" daftar brand mobil yang tersedia ");
                System.out.println("1. Toyota");
                System.out.println("2. Honda");
                System.out.println("3. Bmw");
                Scanner input = new Scanner(System.in);
                System.out.print(
                        "masukan Brand yang anda inginkan : "
                );
                int inputBrand = input.nextInt();
                if (inputBrand == 1){
                    Toyota();
                } else if (inputBrand == 2) {
                    Honda();
                } else if (inputBrand == 3) {
                    Bmw();
                }
            }
        };
        brand.mobil();
    }





}
