package src.latihan;

import java.util.Scanner;

public class ErrorHandling {

  public static void main(String[] args) {


//    try{
//      Scanner inputSiswa = new Scanner(System.in);
//      int[] siswa = {1,2,3};
//      System.out.println("silahkan masukan angka : ");
//      int index = inputSiswa.nextInt();
//      System.out.println(index+" berada pada index ke - "+siswa[index]);
//    }catch (Exception e){
//      System.out.println("index yang cari tidak ada ");
//    }

    try{
      Scanner inputSiswa = new Scanner(System.in);
      System.out.println("masukan umur anda sekarang : ");
      int umur = inputSiswa.nextInt();
      if (umur == 17 || umur >17){
        System.out.println("kamu telah memiliki KTP");
      }else {
        throw new Exception("umur harus di atas 17 di atas 17");
      }
    }catch (Exception e){
      System.err.println("error "+e.getMessage());
    }





  }

}
