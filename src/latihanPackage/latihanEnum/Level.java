package src.latihanPackage.latihanEnum;

public enum Level {
    EASY("stage paling mudah"),
    MEDIUM("stage menengah"),
    HARD("stage paling sulit");

    private String tingkatan;
/*
ini adalah penambahan member berupa constructor
* saat kita menambah param cons kita harus instansiasi pada isi Enumnya yaitu EASY,MEDIUM,HARD sesuai dengan tipe data yang kita masukan
 */
    Level(String tingkatan) {
        this.tingkatan = tingkatan;
    }

    public String getTingkatan(){
        return tingkatan;
    }
}
