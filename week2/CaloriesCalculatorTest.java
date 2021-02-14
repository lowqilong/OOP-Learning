public class CaloriesCalculatorTest {
    public static void main(String[] args) {
        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);

        System.out.println("Pineapple Tarts more sinful than Bak Kwa: " + tart.isMoreSinful(bakKwa));

        double tart_w = tart.getCaloriesPerGram();
        double bakKwa_w = bakKwa.getCaloriesPerGram();
        double loveLetters_w = loveLetters.getCaloriesPerGram();

        String tart_n = tart.getName();
        String bakKwa_n = bakKwa.getName();
        String loveLetters_n = loveLetters.getName();

        System.out.printf("%s (calories per gram) : %.2f%n", tart_n, tart_w);
        System.out.printf("%s (calories per gram) : %.2f%n", bakKwa_n, bakKwa_w);
        System.out.printf("%s (calories per gram) : %.2f%n", loveLetters_n, loveLetters_w);

        CaloriesCalculator cal = new CaloriesCalculator();
        cal.addNewYearGoodie(tart, 2);
        cal.addNewYearGoodie(bakKwa, 3);
        cal.addNewYearGoodie(loveLetters, 5);

        System.out.printf("Total Calories: %.2f%n", cal.getTotalCalories());
        System.out.println("Most sinful goodie :" + cal.getMostSinfulGoodie().getName());
    }
}
