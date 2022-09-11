package src.latihanPackage.latihanAnonymousClass;



import java.util.Scanner;

public class ShowroomApp {

    public static void BRI(){
        Scanner inputSaldo = new Scanner(System.in);
        System.out.print("Masukan nominal : ");
        int inputNominal = inputSaldo.nextInt();
        System.out.println("Nominal yang anda masukan : "+inputNominal);
        kuponDiscount();
    }
    public static void BCA(){
        Scanner inputSaldo = new Scanner(System.in);
        System.out.print("Masukan nominal : ");
        int inputNominal = inputSaldo.nextInt();
        System.out.println("Nominal yang anda masukan : "+inputNominal);
        kuponDiscount();
    }

    public static void MANDIRI(){
        Scanner inputSaldo = new Scanner(System.in);
        System.out.print("Masukan nominal : ");
        int inputNominal = inputSaldo.nextInt();
        System.out.println("Nominal yang anda masukan : "+inputNominal);
        kuponDiscount();
    }

    public static void bank(){
        System.out.println("==== Berikut adalah BANK yang tersedia =====");
        String[] jumlahBank = {
          "BRI" , "BCA" , "MANDIRI"
        };
        for (var i = 0;i< jumlahBank.length;i++){
            System.out.println((i+1)+". "+jumlahBank[i]);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("****************************");
        System.out.print("Pilih BANK : ");
        int inputBank = input.nextInt();
        if (inputBank == 1){
           BRI();
        } else if (inputBank == 2) {
            BCA();
        } else if (inputBank == 3) {
            MANDIRI();
        }else{
            System.out.println("BANK TIDAK TERSEDIA !!!!");
        }

    }

    /*
    tester bank

    static class testerBANK{
        public static void main(String[] args) {
            bank();
        }
    }

     */

    public static void kuponDiscount(){
        Scanner input = new Scanner(System.in);
        System.out.print("MASUKAN KODE BANK YANG DITUJU : ");
        String inputDiscount = input.nextLine();
        if (inputDiscount == null || inputDiscount.equals(" ") ){
            throw new RuntimeDiscount("KODE ANDA DI TOLAK!!!!");
        } else if (inputDiscount.equals("GNS354")) {
            System.out.println("KODE SUKSES");
            System.out.println("********** SELAMAT PEMBELIAN ANDA BERHASIL **********");
        }else {
            throw new RuntimeDiscount("KODE TIDAK TERSEDIA");

        }
    }


    /*
    test validation

    static class test{
        public static void main(String[] args) {
            ShowroomApp nasabah = new ShowroomApp("","");
            try {
                ValidationUtil.validateNasabah(nasabah);
                System.out.println("DATA ACCEPT");
            }catch (ValidationExcaption | NullPointerException excaption){
                System.out.println("DATA ERROR : "+excaption.getMessage());
            }
        }
    }
    */





/*
FUNCTION UNTUK PEMBAYARAN AGYA
 */
    static String pembayaranAgya(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 170_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI: ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("no")) {
                Toyota();
            } else if (beli.equals("NO")) {
                Toyota();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 170_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI: ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("no")) {
                Toyota();
            } else if (beli.equals("NO")) {
                Toyota();
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
        } else if (bayar.equals("KREDIT")) {
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
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 167_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("no")) {
                Toyota();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 167_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("no")) {
                Toyota();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }
        } else if (bayar.equals("KREDIT")) {
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
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 150_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("no")) {
                Toyota();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 150_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("no")) {
                Toyota();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }
        } else if (bayar.equals("KREDIT")) {
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
 ****** MOBIL DI ATAS 200 JUTA *******
FUCNTION PEMBAYARAN RUSH
 */

    static String pembayaranRush(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 261_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
                } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
                } else if (beli.equals("NO")) {
                Toyota();
                } else if (beli.equals("no")) {
                Toyota();
                } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        }
        else if (bayar.equals("KREDIT")) {
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
        } else if (bayar.equals("CASH")) {
            var price = 261_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }
        }
        return "terimakasih  ";
    }


/*
FUNCTION UNTUK PEMBAYARAN FREED
 */

    static String pembayaranFreed(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 258_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 258_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }
        } else if (bayar.equals("KREDIT")) {
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
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 275_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 275_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }
        } else if (bayar.equals("KREDIT")) {
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
    ****** MOBIL DI BAWAH 700 JUTA ******
    FUNCTION UNTUK PEMBAYARAN FORTUNER
     */
    static String pembayaranFortuner(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 564_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 564_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }
        } else if (bayar.equals("KREDIT")) {
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
    FUNCTION PEMBAYARAN VOXY
     */

    static String pembayaranVoxy(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 575_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 575_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }
        } else if (bayar.equals("KREDIT")) {
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
    FUNCTION PEMBAYARAN HARRIER
     */
    static String pembayaranHarrier(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 580_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 580_000_000;
            System.out.println("nominal yang anda harus bayar : "+price);
            System.out.print("KETIK DEAL UNTUK MEMBELI NO UNTUK KEMBALI : ");
            String beli = input.nextLine();
            if (beli.equals("DEAL")){
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("deal")) {
                System.out.println("METODE PEMBAYARAN MELALUI BANK");
                bank();
            } else if (beli.equals("NO")) {
                Toyota();
            } else if (beli.equals("no")) {
                Toyota();
            } else {
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }
        } else if (bayar.equals("KREDIT")) {
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
    public static void Toyota(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan kisaran harga mobil yang diinginkan : ");
        int inputHarga = input.nextInt();
        if(inputHarga<=200_000_000){
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


        } else if (inputHarga>200_000_000 & inputHarga<500_000_000) {
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
        } else if (inputHarga>500_000_000 & inputHarga<=700_000_000 ) {
            System.out.println("==== BERIKUT MOBIL YANG TERSEDIA UNTUK KISARAN HARGA YANG ANDA INGINKAN ==== ");
            String[] daftarMobil = {
                    "Fortuner","Voxy","Harrier"
            };
            for (var i = 0;i< daftarMobil.length;i++){
                System.out.println((i+1)+". "+daftarMobil[i]);
            }
            System.out.print("SILAHKAN PILIH MOBIL YANG ANDA MAU : ");
            int choseMobil =input.nextInt();
            if (choseMobil == 1){
                pembayaranFortuner();
            } else if (choseMobil == 2) {
                pembayaranVoxy();
            } else if (choseMobil == 3) {
                pembayaranHarrier();
            }else {
                System.out.println("!!!! MOBIL TIDAK TERSEDIA !!!!");
            }
        }

    }

    /*
        UNIT TEST HONDA



    static class testHonda{
        public static void main(String[] args) {
            var getHonda = new Honda();
            getHonda.priceMobil();
        }


    }

    */

    /*
    DI BAWAH INI ADALAH MAIN PROGRAMNYA

    */

    public static String[] brandMobil = new String[5];

    public static void menampilkanBrand(){
        System.out.println("***** DAFTAR BRAND MOBIL YANG TERSEDIA *****");
        for (var i = 0 ; i< brandMobil.length;i++) {
            var brand = brandMobil[i];
            var no = i + 1;
            if (brand != null) {
                System.out.println(no + ". " + brand);
            }
        }
    }

    /*
    test menampilkan brandMobil
     */
    public static void testMenampilkanBrand(){
        brandMobil[1] = "TOYOTA";
        brandMobil[2] = "HONDA";
        brandMobil[3] = "BMW";
        menampilkanBrand();
    }

    public static void menambahBrand(String merekMobil){
        //pengecekan apakah branMobil sudah penuh
        var isFull = true;
        for (var i =0;i< brandMobil.length;i++){
            if (brandMobil[i] == null){
                isFull = false;
                break;
            }
        }

        // meresize jika brandMobil sudah penuh
        if (isFull){
            var temp = brandMobil;
            brandMobil = new String[brandMobil.length * 2];
            for (var i = 0;i< temp.length;i++){
                brandMobil[i] = temp[i];
            }
        }

        //tambahkan barang jika masih ada yang kosong
        for (var i =0;i< brandMobil.length;i++){
            if (brandMobil[i] == null){
                brandMobil[i] = merekMobil;
                break;
            }
        }



    }


    /*
    test menambah brandMobil
     */
    public static void testMenambahBrand(){
        for (var i = 0;i< 30;i++){
            menambahBrand("brand ke - "+i);
        }
        menampilkanBrand();
    }


    /*
    menghapus brandMobil
     */

    public static boolean hapusBrand(int nomor){
        if ((nomor-1)>=brandMobil.length){
            return false;
        } else if (brandMobil[nomor-1] == null) {
            return false;
        }else {
            for (var i = (nomor - 1); i < brandMobil.length; i++) {
                if (i == (brandMobil.length - 1)) {
                    brandMobil[i] = null;
                } else {
                    brandMobil[i] = brandMobil[i + 1];
                }
            }
        }
        return true;
    }

    /*
    test hapusBrandMobil
     */

    public static void testHapusBrand(){
        menambahBrand("TOYOTA");
        menambahBrand("HONDA");
        menambahBrand("BMW");
        menambahBrand("LAMBORGINI");
        menambahBrand("FERRARI");
        menampilkanBrand();
        var hapus = hapusBrand(4);
        System.out.println(hapus);
        menampilkanBrand();

    }
    public static void main(String[] args) {

        Showroom brand = new Showroom() {

            public void mobil() {
                menambahBrand("TOYOTA");
                menambahBrand("HONDA");
                menambahBrand("BMW");
                menampilkanBrand();
                Scanner input = new Scanner(System.in);
                System.out.print(
                        "masukan Brand yang anda inginkan : "
                );
                int inputBrand = input.nextInt();
                if (inputBrand == 1){
                    Toyota();
                } else if (inputBrand == 2) {
                    Honda honda =new Honda();
                    honda.priceMobil();
                } else if (inputBrand == 3) {
                    Bmw bmw = new Bmw();
                    bmw.priceMobil();
                }
            }
        };
        brand.mobil();



    }




}
