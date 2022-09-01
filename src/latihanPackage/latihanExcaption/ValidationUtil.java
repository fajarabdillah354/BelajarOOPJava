package src.latihanPackage.latihanExcaption;

import src.latihanPackage.latihanAnonymousClass.ShowroomApp;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationExcaption, NullPointerException{
        if (loginRequest.getUsername() == null){
            throw new ValidationExcaption("USERNAME IS NULL");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new ValidationExcaption("USERNAME IS BLANK");
        } else if (loginRequest.getPassword() == null) {
            throw new ValidationExcaption("PASSWORD IS NULL");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new ValidationExcaption("PASSWORD IS BLANK");
        }
    }

    public static void validateNasabah(ShowroomApp loginRequest)throws ValidationExcaption,NullPointerException{
        if (loginRequest.getUsername()==null){
            throw new ValidationExcaption("USERNAME IS NULL");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new ValidationExcaption("USERNAME IS BLANK");
        } else if (loginRequest.getPassword()==null) {
            throw new ValidationExcaption("PASSWORD IS NULL");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new ValidationExcaption("PASSWORD IS BLANK");
        }
    }



}
