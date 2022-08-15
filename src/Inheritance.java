package src;
/*
inheritance adalah sebuah pewarisan yang ada di dalam bahasa pemograman java, ketika melakukan inheritance maka semua field yang ada di class parent/orang tus(class utama) akan bisa di akses di class child/anak
 */
public class Inheritance {//class parent yang mempuyai 3 field
    Integer nilai;
    String name;
    String gender;

    static class siswa extends Inheritance{//child dari parent
        void sayHello(){//method di dalam child dari parent

            System.out.println(name+" mendapatkan skor : "+nilai);
        }
    }

    static class kelamin extends siswa{//child dari parent(anak kedua)
        void jnsKelamin(){//method di dalam child dari parent
            gender ="laki- laki";
            System.out.println("jenis kelamin "+name+" : "+gender);
        }
    }


    public static void main(String[] args) {
        var ujian =new siswa();//pengaksesan object dengan kata kunci new lalu di lanjut object yang akan di akses
        ujian.name = "fajar abdillah ahmad";//pemberian assigment
        ujian.nilai = 98;//pemberian assigment
        ujian.sayHello();//pengaksessan method yang ada di dalam object
        var gender = new kelamin();////pengaksesan object dengan kata kunci new lalu di lanjut object yang akan di akses
        gender.name = ujian.name;
        gender.jnsKelamin();
    }
}

