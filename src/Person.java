package src;

public class Person {
    /*
    ini adalah contoh pemanggilan object dengan kata kunci new
    lalu di ikuti nama clas  yang telah kita buat
     */
    public static void main(String[] args) {
        var identity = new ClassPerson();
        identity.nama = "fajar abdillah ahmad";
        identity.alamat = "jalan radar selatan";
        System.out.println(identity.nama);
        System.out.println(identity.alamat);
        identity.sayHello("ujeh");
    }

}
