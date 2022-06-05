import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double num1st, double num2nd) {
        DecimalFormat df = new DecimalFormat(".###");
        df.setRoundingMode(RoundingMode.DOWN);
        num1st = Double.parseDouble(df.format(num1st));
        System.out.println(num1st);
        num2nd = Double.parseDouble(df.format(num2nd));
        System.out.println(num2nd);
        if (num1st == num2nd) {
            return true;
        } else {
            return false;
        }
    }
}
