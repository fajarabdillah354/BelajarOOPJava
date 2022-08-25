package src.latihanPackage.ApplicationProduct;

import src.latihanPackage.DateZodiak.ChildAbstract;

public class AppAbstrackCls {
    public static void main(String[] args) {

        /*
        ini adalah pemanggilan object abstract class lewat turunannya
         */
        var intro = new ChildAbstract();//object yang di pakai turunannya bukan parentnya
        intro.perkenalan("fajar abdillah ahmad",21);
    }

}
