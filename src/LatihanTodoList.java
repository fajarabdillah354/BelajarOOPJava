package src;

import java.util.Scanner;

public class LatihanTodoList {
    public static void main(String[] args) {

        tampilkanMenu();
    }

    public static String[] list = new String[10];

/*
berikut adalah membuat daftar lomba 17 agustusan
 */

    public static void menampilkanlomba(){
        System.out.println("=== DAFTAR LOMBA YANG AKAN DILAKSANAKAN ===");
        for (var a = 0;a<list.length;a++){
            var lomba = list[a];
            var no = a+1;
            if (lomba != null){
                System.out.println(no+". "+lomba);
            }
        }
    }


    /*
    MenampilkanDaftarLomba
     */
    public static void testMenampilkanDaftarLomba(){
        list[1] = "Makan Kerupuk";
        list[2] = "Balap Kelereng";
        list[3] = "Balap Karung";

        menampilkanlomba();
    }

    public static void menambahLomba(String lomba){
        //pengecekan apakah daftar sudah  penuh
        var isFull = true;
        for (var a = 0;a< list.length;a++){
            if (list[a] == null){
                isFull = false;
                break;
            }
        }

        // meresize apabila array sudah penuh
        if (isFull){
            var temp = list;
            list = new String[list.length*2];
            for (var a = 0;a< temp.length;a++){
                list[a] = temp[a];
            }

        }


        //menambah barang jika masih ada yang kosong
        for (var a = 0;a< list.length;a++){
            if (list[a] == null){
                list[a] = lomba;
                break;
            }
        }


    }

//test menambah lomba
    public static void testmenambahDaftarLomba(){
        for (var a = 0;a<20;a++){
            menambahLomba("ini contoh ke "+a);

        }
        menampilkanlomba();
    }

    public static boolean menghapusLomba(Integer nomor){
        if ((nomor-1)>= list.length){
            return false;
        } else if (list[nomor-1] == null) {
            return false;
        }else{
            for (int a = (nomor-1);a< list.length;a++){
                if (a == (list.length-1)){
                    list[a] = null;
                }else{
                    list[a] = list[a+1];
                }
            }
            return true;
        }
    }

    //test hapus lomba
    public static void testHapusLomba(){
        menambahLomba("Makan Kerupuk");
        menambahLomba("Balap Karung");
        menambahLomba("Balap Kelereng");

        menampilkanlomba();
        var hapus =menghapusLomba(2);
        System.out.println(hapus);
        System.out.println("ini setelah ada penghapusan pada no 2");
        menampilkanlomba();
        menambahLomba("Bola Kerucut");
        menambahLomba("Taring Tambang");
        System.out.println("ini setelah ada penambahan ");
        menampilkanlomba();
    }

    public static String inputUser(String in){
        Scanner inputs = new Scanner(System.in);
        System.out.print(in+" : ");
        String input = inputs.nextLine();
        return input;
    }

    //testInput user
    public static void testInputUser(){
        var getinput = inputUser("masukan nama anda");
        System.out.println(getinput);
    }


    public static void tampilkanMenu(){
        while (true) {
            menampilkanlomba();
            System.out.println(" menu ");
            System.out.println("1. Tambah Lomba");
            System.out.println("2. Hapus Lomba");
            System.out.println("3. EXIT");

            var input = inputUser("silahkan pilih");
            if (input.equals("1")) {
                tampilkanTambahLomba();
            } else if (input.equals("2")) {
                tampilkanHapusLomba();
            } else {
                System.out.println("***** pilihan tidak tersedia ******");
            }
        }
    }
//test menampilkan menu
    public static void testmenu(){
        menambahLomba("Balap karung");
        menambahLomba("Balap kelereng");
        menambahLomba("Estafet air");
        tampilkanMenu();
    }


    public static void tampilkanTambahLomba(){
        System.out.println("====== menambahkan lomba ======");
        var lomba = inputUser("silahkan pilih x untuk batal");
        if (lomba.equals("x")){
            //batal
        }else {
            menambahLomba(lomba);
        }
    }



    public static void tampilkanHapusLomba(){
        System.out.println("===== mengahapus lomba =====");
        var lomba = inputUser("silahkan pilih x untuk batal");
        if (lomba.equals("x")){
            //batal
        }else{
            boolean sukses = menghapusLomba(Integer.valueOf(lomba));
            if (!sukses){
                System.out.println("gagal menghapus lomba "+lomba);
            }
        }
    }

//test tampilkan hapus lomba
    public static void testtampilkanHapusLomba(){
    menambahLomba("balap karung");
    menambahLomba("balap kelereng");
    menambahLomba("balap lari");
    menampilkanlomba();
    tampilkanHapusLomba();
    menampilkanlomba();
    }

}
