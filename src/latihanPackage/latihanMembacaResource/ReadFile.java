package src.latihanPackage.latihanMembacaResource;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
            while (true){
                String text = reader.readLine();
                if (text == null){
                    break;
                }
                System.out.println(text);
            }
            System.out.println("Sukses membaca file");


        }catch (Throwable throwable){
            throwable.printStackTrace();
            System.out.println("error membaca file "+throwable.getMessage());
        }
    }
}
