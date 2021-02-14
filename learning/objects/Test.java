// Coding conventions
// Java: SeniorManager
// python: senior_manager
import java.util.*;

public class Test {
  // Write once, run everywhere
  // Python: is_happy
  // Java: isHappy
  public static void main(String[] args) {
    // 8.primitive types
    // byte.short.int.long
    // float, double
    // boolean
    // char
    // byte --> -2^8 to 2^8 - 1
    System.out.println("Hello World");
    System.out.println("hello world");

    boolean x = true;
    if (x) {
      System.out.println("XX");

    }
    // Reference data types
    // String --> capital letter

    String s1 = "ab";
    String s2 = "abcdsad";

    System.out.println(s1.length());
    System.out.println(s2.length());
    System.out.println(s2.substring(0, 1));

    String[] fruits = { "apple", "pear" };
    System.out.println(fruits.length);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter x:");
    int value = sc.nextInt();
    System.out.println(value*value);
  }
}
