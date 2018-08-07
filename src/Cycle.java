import java.util.HashMap;
import java.util.Map;

public class Cycle {
    public static int cycle(int n) {
        Double result = 10.0 / 5;
        System.out.println(result);
        System.out.println((10.0 % 5) / 10);
        System.out.println((10.0 % 3) / 10);
        System.out.println((10.0 % 33) / 10);
        System.out.println((10.0 % 37) / 10);
        if (isWholeNumber(result)) {
            return -1;
        }

        return -5;
    }

    public static int findDecimal(Double value) {
        //System.out.println(value);
        String valueString = value.toString();
        for (int i = 0; i < valueString.length(); i++) {
            if (valueString.charAt(i) == '.')
                return i;
        }
        return -1;
    }

    public static boolean isWholeNumber(Double value) {
        //System.out.println(value);
        return value.toString().charAt(value.toString().length() - 1) == '0';
    }

    public static boolean isRepeatingDecimal(Double value) {
        System.out.println(value);
        System.out.println(value.toString().length());
        return value.toString().length() == 19;
    }

//    public static int getCycleLength
//    {
//        int divisor = 7;
//        int dividend = 1;
//
//        while (true) {
//            // Step 2
//            int k = dividend / divisor;  // Floor
//
//            // Step 3
//            dividend -= k * divisor;
//
//            // Step 4
//            dividend *= 10;
//        }
//    }
}
