package src.latihanPackage.DateZodiak;

public class ChildAbstractMethod extends AbstractMethod {
    /*
    * ini adalah child dari abstract class yang di dalammnya terdapat abstract method
    * method yang di tulis ada abstractnya akan di override di child dari classnya
    * jangan lupa menuliskan public untuk bisa di akses dimanapun
     */
    public void getName(){
        System.out.println("cat "+name+" is die");
    }

}
