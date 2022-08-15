package src;

public class VariabelShadowing {

        String name;
        String address;


        void sayHello(String name, String address) {
        System.out.println("hello " + name + " my name is " + name+" domisili saya di " +address);
        }

    public static void main(String[] args) {
            /*
            * kata kunci new digunakan untuk mengakses class yang telah di buat
            * saat variabel shadow dia akan menimpa variabel di atasnya cara mengatasinya dengan menggunakan kata kunci this. lalu di ikuti nama var pada object class(fieldnya)
             */
            var cobaVarshadow = new VariabelShadowing();
            cobaVarshadow.sayHello("fajar", "jaktim");
    }



}



