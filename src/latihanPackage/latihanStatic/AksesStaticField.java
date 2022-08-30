package src.latihanPackage.latihanStatic;

public class AksesStaticField {
    public static void main(String[] args) {
        System.out.println("nama toko : "+StaticVar.nameStore);
        System.out.println("alamat toko : " +
                ""+StaticVar.storePlace);
        StaticVar.setStoreProduk("susu");
        System.out.println("produk unggulan: "+StaticVar.getStoreProduk());
    }

}
