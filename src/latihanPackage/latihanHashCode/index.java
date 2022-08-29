package src.latihanPackage.latihanHashCode;

public class index {
    int countBarang = 354;
    String  namaBarang = "handphone";
    public void getOne(String namaBarang,int countBarang){
        this.countBarang = countBarang;
        this.namaBarang = namaBarang;
        System.out.println(namaBarang+" "+countBarang);
    }

    public static void main(String[] args) {
        var x = new index();
        x.getOne("sonny",300);
        System.out.println(x);//disilah hashcode akan dipanggil
    }

    @Override
    public int hashCode() {
        int result = countBarang;
        result = 31 * result + (namaBarang != null ? namaBarang.hashCode() : 0);
        return result;
    }
}
