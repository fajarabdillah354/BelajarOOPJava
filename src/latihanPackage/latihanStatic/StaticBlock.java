package src.latihanPackage.latihanStatic;

public class StaticBlock {
    public static final int PROCESSOR;
    /*
    jika menggunakan block yang pertama kali kita lakukan adalah menginstansiasi var PROCESSOR (VARIABEL PERTAMA)
     */
    static {
        PROCESSOR=Runtime.getRuntime().availableProcessors();
    }
}
