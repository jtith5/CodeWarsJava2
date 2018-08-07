import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class AruleOfDivisibilityByThirteen {
    public static long thirt(long n) {
        ArrayList<Long> multipliers = createMultipliers();
        HashSet<Long> productSet = new HashSet<>();


        int counter = 0;

        ArrayList<Long> products = new ArrayList<>();

        while(productSet.size() == counter) {
            for (int multipliersIndex = 0; multipliersIndex < multipliers.size(); multipliersIndex++) {
                System.out.println(getLastDigit(n) + " * " + multipliers.get(multipliersIndex));
                products.add(getLastDigit(n) * multipliers.get(multipliersIndex));
                System.out.println("Current products to sum: " + products);
                System.out.println("n = " + n);
                if (isOutOfDigits(n)) {
                    counter++;
                    long product = calculateSum(products);
                    products.clear();
                    productSet.add(product);
                    System.out.println("Calculating sum " + product);
                    System.out.println("n is now " + product);
                    n = product;
                    break;
                }
                else {
                    n = removeLastDigit(n);
                }
            }



        }






        return n;
    }

    public static boolean isOutOfDigits(Long n) {
        return n.toString().length() == 1;
    }

    public static ArrayList<Long> createMultipliers() {
        ArrayList<Long> multipliers = new ArrayList<>();
        multipliers.add(1L);
        multipliers.add(10L);
        multipliers.add(9L);
        multipliers.add(12L);
        multipliers.add(3L);
        multipliers.add(4L);
        return multipliers;
    }

    public static Long calculateSum(ArrayList<Long> products) {
        Long sum = 0L;
        for (Long number : products) {
            sum += number;
        }
        return sum;
    }

    public static Long getLastDigit(Long n) {
       String numberString = n.toString();
       Character lastNumber = numberString.charAt(numberString.length() - 1);
       String lastNumberString = lastNumber.toString();
       return Long.parseLong(lastNumberString);
    }

    public static Long removeLastDigit(Long n) {
        String numberString = n.toString();
        System.out.println("Removing " + numberString.charAt(numberString.length() -1 ) + " from " + n + ".");
        if (isOutOfDigits(n)) {
            return -5L;
        }
        numberString = numberString.substring(0, numberString.length() - 1);
        return Long.parseLong(numberString);
    }
}
