package src.latihanPackage.latihanToString;

public class Produk {
    public String name;
    public int price;
    public Produk(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "nama produk : "+name+" ,harga produk : "+price;


    }
}
