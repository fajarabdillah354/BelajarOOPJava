package src;

public class Consructur {
    String name;
    String address;
    int umur;
    final String country = "indonesia";//kata kunci final di gunakan untuk membuat value dari variabel tidak bisa di manipulasi lagi


    /*
    di bawah ini adalah pembuatan constructor(nama constructor harus sama dengan nama class parentnya)
    pada constructor di bawah mempunyai 2 field/properti/atribute
     */
    Consructur(String paramName, String paramAddress, int usia){
    name = paramName;
    address = paramAddress;
    umur = usia;
    }

    /*
    constructor overloadig
    yaitu kita bisa membuat constructor lebih dari 1 dengan syarat parameternya berbeda

    * kata kunci this digunakan untuk memanggil constructor lain

     */
    Consructur(int usia){
        this(null,null,21);
    }


    Consructur(){
    this(null,null,21);
    }
}
