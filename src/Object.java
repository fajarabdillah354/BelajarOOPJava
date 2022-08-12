public class Object {
    /*
     *kita bisa membuat beberapa class lalu kita akses
     */
    public static void main(String[] args) {
        var orang = new ClassObject();
        orang.nama = "fajar";
        orang.alamat = "jakarta";
        System.out.println(orang.nama);
        System.out.println(orang.alamat);
        orang.sayHello("udin");
    }
}
