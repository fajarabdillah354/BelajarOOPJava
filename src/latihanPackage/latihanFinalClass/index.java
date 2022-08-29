package src.latihanPackage.latihanFinalClass;

import org.w3c.dom.ls.LSOutput;

public class index {


    final class quantity extends index {
        public static void main(String[] args) {
            System.out.println("pada final class kita tidak bisa melakukan penurunan terhadap class yang mempunyai kata kunci final");
        }
    }

//ini akan error karna class quantity adalah final jadi tidak bisa diturunkan

    /*
     class brand extends quantity{

    }
    */
}