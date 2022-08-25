package src.latihanPackage.DateZodiak;

public class ChildAbstract extends AbstractClass {

    /*
    ini adalah class child untuk abstract class ,nanti disini lah object akan di panggil secara langsung
     */
    public int umur;
    public void perkenalan(String name,int umur){
        this.umur = umur;
        this.name = name;
        System.out.println("hello perkenalkan saya "+this.name+" dan usia saya "+this.umur);
    }
}
