package src;

public class MethodOverloading {
    String name;
    void sayHello(String name){
        System.out.println("hey "+name+" I am siput "+this.name);
    }
    static class identity extends MethodOverloading{
        void sayHello(String name){
            System.out.println("hey "+name+" I am superman "+this.name);
        }

    }

    public static void main(String[] args) {
        /*
        saat terjadi method overloading maka method yng telah ada di parent sebelumnya akan tertumpuk sehingga tidak bisa di pakai lagi
         */
        var iden1 = new MethodOverloading();
        iden1.name = "hero";
        iden1.sayHello("ujeh");//method ini akan tertimpa oleh method berikutnya karna mempunyyai struktur yang sama
        var iden = new identity();
        iden.name = "zeus";
        iden.sayHello("fajar");
    }

}

