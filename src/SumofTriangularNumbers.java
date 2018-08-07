import java.util.ArrayList;

public class SumofTriangularNumbers {
    public static int sumTriangularNumbers(int n) {
        int sum = 0;
        //loop thru array list and add numbers
        for (Integer element : FindXTriangleNumbers(n)) {
            sum += element;
        }

        return sum;
    }

    public static ArrayList<Integer> FindXTriangleNumbers (int n) {
        ArrayList<Integer> triangleNumbers = new ArrayList<>();
        //triangleNumbers.add(1);
        //triangleNumbers.add(3);
        int numberToAdd = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d + %d = %d\n", i, numberToAdd, i + numberToAdd);
            triangleNumbers.add(i + numberToAdd);
            numberToAdd += i;
            System.out.println("number to add = " + numberToAdd);
        }
        return triangleNumbers;
    }
}

// (4) 1+3+6+10
// (5) 1+3+6+10+15
