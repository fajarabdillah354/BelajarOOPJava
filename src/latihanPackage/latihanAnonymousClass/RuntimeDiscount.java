package src.latihanPackage.latihanAnonymousClass;

public class RuntimeDiscount extends RuntimeException {
    public RuntimeDiscount(String message){
        super(message);
    }
    public static void runValidate(RunValidate validate) {
        if (validate.getKode() == null){
            throw new RuntimeException("KODE TIDAK BOLEH NULL");
        } else if (validate.getKode().isBlank()) {
            throw new RuntimeException("KODE TIDAK BOLEH KOSONG");
        } else if (validate.getKode() != "GNS354") {
            throw new RuntimeException("KODE YANG ANDA MASUKAN SALAH");
        }
    }

    static class testValidate{
        public static void main(String[] args) {
            RunValidate kode = new RunValidate("GNS354");
            RuntimeDiscount.runValidate(kode);
            try{
                System.out.println("SELAMAT KODE ANDA BERHASIL ");
            }catch (RuntimeException runtimeException){
                System.out.println("error : "+runtimeException.getMessage());
            }
        }
    }
}
