package src.latihanPackage.latihanAnonymousClass;

import java.util.Scanner;

public class Honda {

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
    FUNCTION PEMBAYARAN BRIO
     */
    public void pembayaranBRIO(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 220_000_000;
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
            var price = 220_000_000;
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
    FUNCTION PEMBAYARAN MOBILIO
     */
    public void pembayaranMOBILIO(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 250_000_000;
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
            var price = 250_000_000;
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
    function pembayaran BRV
     */

    public void pembayaranBRV(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 268_000_000;
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
            var price = 268_000_000;
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
    FUNCTION PEMBAYARAN CRV
     */

    public void pembayaranCRV(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 497_000_000;
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
            var price = 497_000_000;
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
    FUNCTIOON PEMBAYARAN HRV
     */

    public  void pembayaranHRV(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 489_000_000;
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
            var price = 489_000_000;
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
    FUNCTION PEMBAYARAN FREED
     */
    public  void pembayaranFREED(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 378_000_000;
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
            var price = 378_000_000;
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
    FUNCTION PEMBAYARAN MOBIL RANGE TINGGI ACCORD
     */

    public  void pembayaranACCORD(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 658_000_000;
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
            var price = 658_000_000;
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
    FUNCTION PEMBAYARAN ODYSEY
     */
    public  void pembayaranODYSEY(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 650_000_000;
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
            var price = 650_000_000;
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
    FUNCTION PEMBAYARAN PRESTIGE
     */
    public void pembayaranPRESTIGE(){
        Scanner input =new Scanner(System.in);
        System.out.print("silahkan pilih jenis pembayaran (cash/kredit) : ");
        String bayar = input.nextLine();
        if (bayar.equals("cash")){
            var price = 690_000_000;
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
            var price = 690_000_000;
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
        int inputHarga = input.nextInt();
        if(inputHarga >= 200_000_000 && inputHarga<=300_000_000){
            System.out.println("===== BERIKUT MOBIL YANG TERSEDIA UNTUK KISARAN HARGA YANG ANDA INGINKAN =====");
            String[] daftarMobil = {
                    "Brio","Mobilio","BR-V"
            };
            for (var a = 0;a< daftarMobil.length;a++){
                System.out.println((a+1)+". "+daftarMobil[a].toUpperCase());


            }
            System.out.print("SILAHKAN PILIH MOBIL YANG ANDA MAU : ");
            int choseCar = input.nextInt();
            if (choseCar==1){
                pembayaranBRIO();
            } else if (choseCar==2) {
                pembayaranMOBILIO();
            } else if (choseCar==3) {
                pembayaranBRV();
            }else {
                System.out.println("!!!! MOBIL TIDAK TERSEDIA !!!!");
            }


        } else if (inputHarga>=300_000_000 && inputHarga<=500_000_000) {
            System.out.println("==== BERIKUT MOBIL YANG TERSEDIA UNTUK KISARAN HARGA YANG ANDA INGINKAN ==== ");
            String[] daftarMobil = {
                    "CR-V","HR-V","FREED"
            };
            for (var i = 0;i< daftarMobil.length;i++){
                System.out.println((i+1)+". "+daftarMobil[i]);
            }
            System.out.print("SILAHKAN PILIH MOBIL YANG ANDA MAU : ");
            int choseMobil =input.nextInt();
            if (choseMobil == 1){
                pembayaranCRV();
            } else if (choseMobil == 2) {
                pembayaranHRV();
            } else if (choseMobil == 3) {
                pembayaranFREED();
            }else {
                System.out.println("!!!! MOBIL TIDAK TERSEDIA !!!!");
            }
        } else if (inputHarga>=500_000_000 && inputHarga<=700_000_000 ) {
            System.out.println("==== BERIKUT MOBIL YANG TERSEDIA UNTUK KISARAN HARGA YANG ANDA INGINKAN ==== ");
            String[] daftarMobil = {
                    "ACCORD","ODYSEY","CR-V PRESTIGE"
            };
            for (var i = 0;i< daftarMobil.length;i++){
                System.out.println((i+1)+". "+daftarMobil[i]);
            }
            System.out.print("SILAHKAN PILIH MOBIL YANG ANDA MAU : ");
            int choseMobil =input.nextInt();
            if (choseMobil == 1){
                pembayaranACCORD();
            } else if (choseMobil == 2) {
                pembayaranODYSEY();
            } else if (choseMobil == 3) {
                pembayaranPRESTIGE();
            }else {
                System.out.println("!!!! MOBIL TIDAK TERSEDIA !!!!");
            }
        }
    }


}
