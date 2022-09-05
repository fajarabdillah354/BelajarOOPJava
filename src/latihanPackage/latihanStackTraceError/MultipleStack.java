package src.latihanPackage.latihanStackTraceError;

public class MultipleStack extends Throwable{
    public static void main(String[] args) {
        try{
            sendError();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
    }

    /*
    ini adalah contoh multiple stackTrace dengan jenis error yang berbeda yaitu Runtime dan Throwable
     */
    public static void sendError(){
        try{
            String[] names = {
                   "fajar","gabriel","kakek"
            };
            System.out.println(names[100]);
        }catch (RuntimeException exception){
            exception.printStackTrace();
        }
    }
}
