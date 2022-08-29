package src.latihanPackage.latihanFinalMethod;

public class index {
    String makanan;
     final void makanan(String name){
        this.makanan = name;
        System.out.println(this.makanan+" dari daerah padang");
    }
    /*
    di bawah ini akan error sebab method makanan adalah final jadi tidakk bisa di override lagi
     */
    class bentuk extends index{
        void makanan(String name){

        }
    }
}
