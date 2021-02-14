import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Q4 {
  public static void main(String[] args) {
    int total = 1;
    int number = 0;
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number: ");
    number = sc.nextInt();

    while (number >= 0) {
      total *= number;
      System.out.print("Enter number: ");
      number = sc.nextInt();
    }

    if (total > 1 || total == 0) {
      System.out.println(total);
    } else {
      System.out.println("No positive number is entered");
    }




  }
}