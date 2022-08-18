package src;

import java.util.Scanner;

public class VariabelOverridding {
    String alamat = "jakarta timur";
    final String county = "indonesia";

    VariabelOverridding(String name){
        if (name.equals("fajar")){
            for (var i = 1;i<4;i++){
                Scanner input = new Scanner(System.in);
                System.out.println("Masukan Nik anda : ");
                String inputUser = input.nextLine();
                for (var j = 1;j<3;j++){
                    Scanner in = new Scanner(System.in);
                    System.out.println("Masukan nama orang tua anda : ");
                    String inputParent = in.nextLine();
                    for(var l = 1;l<2;l++){
                        Scanner inn = new Scanner(System.in);
                        System.out.println("Masukan nama tanggal lahir  anda : ");
                        String inputchild = in.nextLine();

                    }
                    break;
                }
                break;

            }
            alamat = "jawa tengah";//value dari alamat yang awal akan ketutup oleh alamat yang baru

        }

    }


    static class get{
        public static void main(String[] args) {
            VariabelOverridding ambilData = new VariabelOverridding("fajar");
            System.out.println(ambilData);
            System.out.println(ambilData.alamat);
            System.out.println(ambilData.county);
        }
    }
}
