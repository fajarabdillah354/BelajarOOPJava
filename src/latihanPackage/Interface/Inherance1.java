package src.latihanPackage.Interface;

public interface Inherance1 extends InheranceInterface {
    void name1();
    int dateCar1();

    default int stock1(){
        return 354;
    }



    void name2();
    int dateCar2();

    default int stock2(){
        return 239;
    }

    void name3();
    int dateCar3();
    default int stock3(){
        return 600;
    }





}
