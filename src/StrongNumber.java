class StrongNumber {

    public static String isStrongNumber(int num) {
        Integer numObject = num;
        String numstring = numObject.toString();
        Integer factorialSum = 0;
        for (int i = 0; i < numstring.length(); i++) {
            factorialSum += factorialRecursively(Integer.parseInt(numstring.substring(i, i + 1)));
        }
        if (factorialSum == num) {
            return "STRONG!!!!";
        }
        return "Not Strong !!";

    }

    public static int factorial(int number) {
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        return product;
    }

    public static int factorialRecursively(int number) {
        if (number == 1) {
            return 1;
        }
        return factorialRecursively(number - 1) * number;
    }

}