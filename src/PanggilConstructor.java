package src;

public class PanggilConstructor {

    public static void main(String[] args) {

    /*
    pemanggilan constcructor harus mengggunakan object new atau kata kunci new lalu di ikuti dengan nama object yang ingin kita akses
     */

        var peserta = new Consructur("fajar abdillah ahmad","Jakarta Timur",21);
        System.out.println(peserta.name);
        System.out.println(peserta.address);
        System.out.println(peserta.country);
        System.out.println(peserta.umur);




    }


}