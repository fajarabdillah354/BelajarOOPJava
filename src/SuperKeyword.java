package src;
import java.util.*;
public class SuperKeyword {
    void register() {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama anda : ");
        String inputUser = input.nextLine();

    }

    static class login extends SuperKeyword{
        void peserta(){
            Scanner input =new Scanner(System.in);
            System.out.println("masukan umur anda : ");
            int inputUser = input.nextInt();
        }
    }

    /*
    kata kunci super digunakan untuk mengakses method yang ada pada  class parent
     */
    static class execute extends login{
        void getRegister(){
            super.register();
        }
        void getPeserta(){
            super.peserta();
        }

    }


    public static void main(String[] args) {
        var a = new SuperKeyword();
        a.register();
        var b = new execute();
        b.getRegister();
        b.getPeserta();

    }

}
