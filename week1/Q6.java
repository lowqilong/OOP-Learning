import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }
    }

    // This method returns true if str2 can be aligned with str1
    // and false otherwise. If there is an alignment, this method
    // also prints out the alignment. See the sample runs of the
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        // Modify the code below to return the correct value.

        String alignment = "";
        str2 = str2 + " ";

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0) && str2.length() != 1) {
                alignment += str1.charAt(i);
                str2 = str2.substring(1);
            } else {
                alignment += " ";
            }
        }

        if (str2.length() == 1) {
            System.out.println(alignment);
            return true;
        } else {
            return false;
        }

    }

}
