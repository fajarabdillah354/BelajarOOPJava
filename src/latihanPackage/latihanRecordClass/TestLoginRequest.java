package src.latihanPackage.latihanRecordClass;

/*
cara menambahkan data untuk class record di dalam parameternya bukan pada block kodenya
data yang ada di dalam parameter Final sekaligus menjadi Constructor untuk recordnya
 */
public record TestLoginRequest(String Id,String password) {
    /*
    saat program di running maka constructor di  bawah ini akan pertama kali di jalannkan
     */
    public TestLoginRequest{
        System.out.println("==== tempat pengimpanan data ====");
    }

    /*
    berikut adalah pembuatan beberapa constructor.saat membuat constructor baru kita wajib memanggil constructor utamanya
     */

    public TestLoginRequest(String username){
        this(username,"");
    }

    public TestLoginRequest(){

        this(null,null);//constructor utama tetap di panggil
    }
}
