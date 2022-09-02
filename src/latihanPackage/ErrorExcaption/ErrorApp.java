package src.latihanPackage.ErrorExcaption;

import src.latihanPackage.latihanExcaption.LoginRequest;

public class ErrorApp {
    public static void main(String[] args) {
        connectDataBase("fajar",null);
    }
    public static void connectDataBase(String username,String password){
        if (username == null || password == null){
            throw new TestError("tidak bisa connect ke databases");
        }
    }

}
