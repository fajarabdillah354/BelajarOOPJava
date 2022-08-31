package src.latihanPackage.latihanRecordClass;

public class AksesRecord {
    public static void main(String[] args) {
        TestLoginRequest tester = new TestLoginRequest("fajar354","fahmifadilah354");
        System.out.println(tester);
        System.out.println(tester.Id());
        System.out.println(tester.password());
        System.out.println(tester.hashCode());

    }


}
