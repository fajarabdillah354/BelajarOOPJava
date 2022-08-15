package src;

public class MengatasiVarShadow {//dalam pembuatan class bisa di dalam file yang terpisah dengan file yang digunakan untuk melakukan running dengan syarat kita tetap menggunakan kata kunci new untuk mengakses object classnya

    String name;
    String address;
    final String country = "indonesia";

    void sayHello(String name, String address){
        /*
        * untuk mengatasi var shadow kita harus menggunakan kata kunci this
        * this akan mengakses field pada class parent(object)
         */
        this.name = "udin";
        System.out.println("hello "+this.name+" my name is "+name+" domisili saya di "+address+" "+country);
    }

    public static void main(String[] args) {
        var person = new MengatasiVarShadow();
        person.sayHello("fajar",
                "Bekasi");

    }



}


