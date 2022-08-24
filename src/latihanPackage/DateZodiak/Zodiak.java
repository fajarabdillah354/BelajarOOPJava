package src.latihanPackage.DateZodiak;

public class Zodiak {

    String name;


       public void menampilkanNameMouth(){
            String[] namaBulan = {
              "januari",
              "febuari",
              "maret",
              "april",
              "mei",
              "juni",
              "juli",
              "agustus",
              "september",
              "oktober",
              "november",
              "desember"
            };
            for (var i = 0;i< namaBulan.length;i++){
                System.out.println((i+1)+". "+namaBulan[i]);
            }
        }







        public void menampilkanNameZodiak(){
            String[] namaZodiak = {
              "aries",
              "taurus",
              "gemini",
              "cancer",
              "leo",
              "virgo",
              "libra",
              "scorpio",
              "sagitarius",
              "capricorn",
              "aquarius",
              "pisces"
            };
            for (var i = 1;i<namaZodiak.length;i++){
                System.out.println((i+1)+". "+namaZodiak[i]);
            }
        }







}
