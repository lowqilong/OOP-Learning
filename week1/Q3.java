import java.util.*;

public class Q3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter sentence: ");
    String sentence = sc.nextLine();

    String[] words = sentence.split(" ");

    String output = "";

    for (int i = words.length - 1; i >= 0; i--) {
      output += words[i];
      output += " ";
    }

    System.out.println(output);
  }
}