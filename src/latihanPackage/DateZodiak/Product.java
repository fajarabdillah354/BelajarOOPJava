package src.latihanPackage.DateZodiak;

public class Product {
    //agar varibel bisa di pakai di mana saja kita harus menggantinya dengan public
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("nama barang "+this.name+" ,harga barang "+this.price);
    }

}
