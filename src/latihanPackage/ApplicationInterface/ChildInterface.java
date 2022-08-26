package src.latihanPackage.ApplicationInterface;

import src.latihanPackage.Interface.DataPerson;

import java.util.Scanner;

public class ChildInterface implements DataPerson {

    public void biodataDiri(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama lengkap anda : ");
        String a = input.nextLine();
        System.out.println("Masukan Nik anda : ");
        String b = input.nextLine();
        System.out.println("Masukan alamat anda : ");
        String c = input.nextLine();
        System.out.println("Masukan umur anda : ");
        int d = input.nextInt();
        System.out.println("******** your identity *******");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public void agendaDiri(){
        String[] agenda = {
                "bangun tidur",
                "mandi",
                "sarapan",
                "kuliah",
                "istirahat"
        };
        System.out.println("=== agenda kegiatan ===");
        for (var a = 0;a < agenda.length;a++){
            System.out.println((a+1)+". "+agenda[a]);

        }

    }


}
