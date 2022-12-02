package src.latihan;

import src.latihanPackage.latihanExcaption.ValidationExcaption;

import java.util.Scanner;

public class Ktp {




  public static void cekKtp(){
    System.out.println("==== Pengecekan KTP ======");
    Scanner input = new Scanner(System.in);
    System.out.println("masukan umur anda sekarang : ");
    int umur = input.nextInt();

    try{
      if (umur > 17){
        System.out.println("selamat anda bisa membuat KTP");
      } else if (umur == 0) {
        throw new  Ktp.Runtime("umur tidak boleh 0");
      } else {
        throw new Ktp.Exepcetion("umur anda tidak cukup untuk membuat KTP");
      }

    }catch (Exepcetion exepcetion){
      System.out.println("data tidak valid : "+exepcetion.getMessage());
    }catch (RuntimeException e){
      System.out.println("error : "+e.getMessage());
    }
  }

  public static void main(String[] args) {
    cekKtp();
  }


  public static class Exepcetion extends  Throwable{

    public Exepcetion(String message) {
      super(message);
    }
  }

  public static class Runtime extends RuntimeException{
    public Runtime(String message) {
      super(message);
    }
  }





}
