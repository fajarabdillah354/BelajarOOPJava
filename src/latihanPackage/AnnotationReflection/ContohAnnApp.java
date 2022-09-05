package src.latihanPackage.AnnotationReflection;

public class ContohAnnApp {

    public static void main(String[] args) {

        int kode;
        animals();
    }
    @ContohAnnotation(name ="nama hewan")//tidak harus di tambaahkan isi paramnya karna field yang ada di file Annotationnya mempunyai nilai default
    public static void animals(){

        String[] animalNames = {
            "gajah","kelinci","sapi"
        };
        System.out.println(animalNames[1]);
        System.out.println(animalNames[2]);
        System.out.println(animalNames[3]);
    }
}
