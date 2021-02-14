import java.util.*;

public class Q2 {
  public static void main(String[] args) {

    String firstWord;
    String secondWord;
    boolean firstTime = true;

    do {
      if (firstTime) {
        firstTime = false;
      } else {
        System.out.println("try again");
      }
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter first word:");
      firstWord = sc1.nextLine();

      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter second word:");
      secondWord = sc2.nextLine();
    } while (firstWord.charAt(0) != secondWord.charAt(0) || firstTime);

    System.out.println("Bingo");
  }
}