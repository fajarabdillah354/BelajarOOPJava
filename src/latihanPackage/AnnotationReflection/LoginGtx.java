package src.latihanPackage.AnnotationReflection;

public class LoginGtx {
    @NotBlank
    String userName;
    @NotBlank
    String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
