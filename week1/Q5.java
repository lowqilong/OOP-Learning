import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    String alpha = "abcdefghijklmnopqrstuvwxyz";

    System.out.println("Enter size");

    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();
    String answer = "";

    for (int i = 0; i < number; i++) {
      int n;
      if (i > 25) {
        n = i % 26;
      } else {
        n = i;
      }
      answer += alpha.charAt(n) + " ";
    }

    System.out.println(answer);
  }
}