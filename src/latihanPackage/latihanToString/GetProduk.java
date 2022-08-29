package src.latihanPackage.latihanToString;

public class GetProduk {
    public static void main(String[] args) {
        Produk motor = new Produk("PCX",35_000_000);
        System.out.println(motor);
        System.out.println(motor.toString());//tidak perlu menggunakan method toString() untuk mengakses object
    }

}
