package src.latihanPackage.AnnotationReflection;

import src.latihanPackage.latihanExcaption.ValidationUtil;

public class GtxApp {
    public static void main(String[] args) {
        LoginGtx login = new LoginGtx();
        login.setUserName("fajar Abdillah AHMAD");
        login.setPassWord("clarakuuu");
        ValidationUtil.validationReflection(login);
    }
}
