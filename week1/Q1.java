public class Q1 {

    public static int sumOfDigits(int number) {
        String strNumber = String.valueOf(Math.abs(number));

        int total = 0;

        for (int i = 0; i < strNumber.length(); i++) {
            total += Character.getNumericValue(strNumber.charAt(i));
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}
