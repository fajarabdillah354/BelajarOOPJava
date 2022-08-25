package src.latihanPackage.encapsulation;

public class AppEcapsulation {
    public static void main(String[] args) {
        encapsulation tester = new encapsulation();
        tester.setName("vario 160 abs");
        tester.setName("aerox");
        System.out.println(tester.getName());
        tester.setPrice(25_000_000);
        System.out.println("price : "+tester.getPrice());



    }


}
