package src.latihanPackage.DateZodiak;

public class ProductApp {
    public static void main(String[] args) {
        /*
        kita panggil object Product yang mana dia sebagai conscructor
         */
        Product product = new Product("Macboox",20_000_000);
        /*
        kita akses file yang ada di package yang sama,untuk acceess telah kita beri protected sehingga bisa pada package yang sama
         */
        System.out.println("nama product : "+product.name);
        System.out.println("price product : "+product.price);
    }
}
