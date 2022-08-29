package src.latihanPackage.latihanInnerClass;

public class CompanyApp {
    public static void main(String[] args) {

        Company pt = new Company();
        pt.setName("alam nusantara");
        Company.Employee pegawai = pt.new Employee();
        pegawai.setName("fajar abdillah ahmad");
        System.out.println(pt.getName());
        System.out.println(pegawai.getName());
        System.out.println(pegawai.getCompany());//akan menghasilkan hasil running yang sama dengan  pt.getName()
        Company.Employee pegawai2 = pt.new Employee();
        pegawai2.setName("fajar abdillah ahmad");
        System.out.println(pegawai.equals(pegawai2));//ini bernilai true karna sudah  kita override dengan generator pada file Company.java
    }

}
