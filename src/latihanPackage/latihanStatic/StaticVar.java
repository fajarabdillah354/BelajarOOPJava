package src.latihanPackage.latihanStatic;

public class StaticVar {
    /*
    deklarasi static field
     */
    public final static String nameStore = "Warung fajar barokah";
    public final static String storePlace = "Jakarta Timur";
    public static String storeProduk;

    public static String getStoreProduk() {
        return storeProduk;
    }

    public static void setStoreProduk(String storeProduk) {
        StaticVar.storeProduk = storeProduk;
    }
}
