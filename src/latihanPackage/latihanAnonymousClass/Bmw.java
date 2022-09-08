package src.latihanPackage.latihanAnonymousClass;

import java.util.Scanner;

public class Bmw {
    public void BRI(){
        Scanner inputSaldo = new Scanner(System.in);
        System.out.print("Masukan nominal : ");
        int inputNominal = inputSaldo.nextInt();
        System.out.println("Nominal yang anda masukan : "+inputNominal);
        kuponDiscount();
    }

    public void BCA(){
        Scanner inputSaldo = new Scanner(System.in);
        System.out.print("Masukan nominal : ");
        int inputNominal = inputSaldo.nextInt();
        System.out.println("Nominal yang anda masukan : "+inputNominal);
        kuponDiscount();
    }

    public void MANDIRI(){
        Scanner inputSaldo = new Scanner(System.in);
        System.out.print("Masukan nominal : ");
        int inputNominal = inputSaldo.nextInt();
        System.out.println("Nominal yang anda masukan : "+inputNominal);
        kuponDiscount();
    }

    public void kuponDiscount(){
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

    public void bank(){
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
    PEMBAYARAN 320iLUXURY

     */
    public void pembayaran320i(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 610_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 610_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
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
    }


    /*
    FUNCTION PEMBAYARAN X1
     */
    public void pembayaranX1(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 677_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 677_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
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
    }

    /*
    function pembayaran X3
     */

    public void pembayaranX3(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 668_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 668_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
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
    }

    /*
    FUNCTION PEMBAYARAN 530i
     */

    public void pembayaran530i(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 797_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 797_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
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
    }

    /*
    FUNCTIOON PEMBAYARAN 218i
     */

    public  void pembayaran218i(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 809_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 809_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
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
    }


    /*
    FUNCTION PEMBAYARAN 18i
     */
    public  void pembayaran18i(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 900_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 900_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
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
    }

    /*
    FUNCTION PEMBAYARAN MOBIL RANGE TINGGI M1
     */

    public  void pembayaranM1(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 1_210_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 1_210_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
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
    }

    /*
    FUNCTION PEMBAYARAN M2
     */
    public  void pembayaranM2(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 1_450_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 1_450_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
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
    }

    /*
    FUNCTION PEMBAYARAN 640li
     */
    public void pembayaran640li(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 1_490_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
            } else{
                System.out.println("terimakasih telah mengunjungi Showroom kami");
            }

        } else if (bayar.equals("CASH")) {
            var price = 1_490_000_000;
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
                priceMobil();
            } else if (beli.equals("NO")) {
                priceMobil();
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
    }
    public void priceMobil(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan kisaran harga mobil yang diinginkan : ");
        long inputHarga = input.nextInt();
        if(inputHarga >= 500_000_000 && inputHarga<=700_000_000){
            System.out.println("===== BERIKUT MOBIL YANG TERSEDIA UNTUK KISARAN HARGA YANG ANDA INGINKAN =====");
            String[] daftarMobil = {
                    "BMW 320i LUXURY","BMW X1","BMW X3"
            };
            for (var a = 0;a< daftarMobil.length;a++){
                System.out.println((a+1)+". "+daftarMobil[a].toUpperCase());


            }
            System.out.print("SILAHKAN PILIH MOBIL YANG ANDA MAU : ");
            int choseCar = input.nextInt();
            if (choseCar==1){
                pembayaran320i();
            } else if (choseCar==2) {
                pembayaranX1();
            } else if (choseCar==3) {
                pembayaranX3();
            }else {
                System.out.println("!!!! MOBIL TIDAK TERSEDIA !!!!");
            }


        } else if (inputHarga>=700_000_000 && inputHarga<=1_000_000_000) {
            System.out.println("==== BERIKUT MOBIL YANG TERSEDIA UNTUK KISARAN HARGA YANG ANDA INGINKAN ==== ");
            String[] daftarMobil = {
                    "BMW 530i Sport","BMW 218i Sport","BMW X1 18i"
            };
            for (var i = 0;i< daftarMobil.length;i++){
                System.out.println((i+1)+". "+daftarMobil[i]);
            }
            System.out.print("SILAHKAN PILIH MOBIL YANG ANDA MAU : ");
            int choseMobil =input.nextInt();
            if (choseMobil == 1){
                pembayaran530i();
            } else if (choseMobil == 2) {
                pembayaran218i();
            } else if (choseMobil == 3) {
                pembayaran18i();
            }else {
                System.out.println("!!!! MOBIL TIDAK TERSEDIA !!!!");
            }
        } else if (inputHarga>=1_000_000_000 && inputHarga<=1_500_000_000 ) {
            System.out.println("==== BERIKUT MOBIL YANG TERSEDIA UNTUK KISARAN HARGA YANG ANDA INGINKAN ==== ");
            String[] daftarMobil = {
                    "BMW M1 35i","BMW M2 35i","BMW 640li Sport"
            };
            for (var i = 0;i< daftarMobil.length;i++){
                System.out.println((i+1)+". "+daftarMobil[i]);
            }
            System.out.print("SILAHKAN PILIH MOBIL YANG ANDA MAU : ");
            int choseMobil =input.nextInt();
            if (choseMobil == 1){
                pembayaranM1();
            } else if (choseMobil == 2) {
                pembayaranM2();
            } else if (choseMobil == 3) {
                pembayaran640li();
            }else {
                System.out.println("!!!! MOBIL TIDAK TERSEDIA !!!!");
            }
        }
    }
}
