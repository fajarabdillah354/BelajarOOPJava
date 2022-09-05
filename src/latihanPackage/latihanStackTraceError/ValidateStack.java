package src.latihanPackage.latihanStackTraceError;

public class ValidateStack extends Throwable {
    public static void main(String[] args) {
        try {
            String[] dateNames = {
                    "fajar","andi","mika"
            };
            System.out.println(dateNames[100]);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }



}
