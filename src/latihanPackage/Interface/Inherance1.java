package src.latihanPackage.Interface;

public interface Inherance1 extends InheranceInterface {
    void name1();
    int dateCar1();

    default int stock1(){
        return 1;
    }



    void name2();
    int dateCar2();

    default int stock2(){
        return 1;
    }






}
