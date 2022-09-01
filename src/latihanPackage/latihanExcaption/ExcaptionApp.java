package src.latihanPackage.latihanExcaption;

public class ExcaptionApp {
    public static void main(String[] args) {
        /*
        ini hanya sekedar validation data
         */
        LoginRequest loginRequest =new LoginRequest(null,"ujeh354");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("DATA VALID");
        }catch (ValidationExcaption | NullPointerException excaption){
            System.out.println("DATA TIDAK VALID : "+excaption.getMessage());
        }
    }
}
