package src.StudikasusOOP.Util;

import java.util.Scanner;

public class InputUtil {

  private static Scanner scanner = new Scanner(System.in);

  public static String inputUser(String info){
    System.out.print(info + " : ");
    String input = scanner.nextLine();
    return input;
  }
}
