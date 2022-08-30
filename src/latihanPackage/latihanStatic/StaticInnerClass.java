package src.latihanPackage.latihanStatic;

public class StaticInnerClass {
    String siswa;
    int NIK;
    static class sekolah{
        void ekskulSekolah(){
            System.out.println(" MACAM - MACAM ESKUL YANG ADA");
            String[] ekskul = {
                    "Bola Basket",
                    "Sepak Bola",
                    "Berenang",
                    "Memanah",
                    "Berkuda"
            };
            for(var a = 0;a<ekskul.length;a++){
                System.out.println((a+1)+". "+ekskul[a]);

            }
        }


    }
}
