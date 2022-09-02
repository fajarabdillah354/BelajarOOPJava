package src.latihanPackage.latihanRuntimeExcaption;

import src.latihanPackage.latihanExcaption.LoginRequest;
import src.latihanPackage.latihanExcaption.ValidationUtil;

public class RuntimeApp {
    public static void main(String[] args) {
        LoginRequest runTime = new LoginRequest("FAJAR","ujehhhhh25");
        ValidationUtil.RunTimeExcaption(runTime);
        try{
            /*
            jika program berhasil maka akan menampilkan tulisan ini
             */
            System.out.println("sukses");
        }catch (RuntimeException runtimeException){
            /*
            jika program terdapt error maka program akan error dan perintah di bawah tidak di jalankan
             */
            System.out.println("tidak sukses : "+runtimeException.getMessage());
        }

    }


}
