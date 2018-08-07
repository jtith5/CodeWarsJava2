import java.util.Arrays;
public class Kata {
    public static void main(String[] args) {
        matrixSquareUp(2);
        System.out.println();
        matrixSquareUp(3);
        System.out.println();
        matrixSquareUp(4);


    }

    public static String[][] matrixSquareUp(int b) {
        String[][] array = new String[b][b];
        populate2DArray(array);
        print2DArray(array);
        return array;
    }

    public static void print2DArray(String[][] string) {
        for (int row = 0; row < string.length; row++) {
            System.out.println();
            for (int column = 0; column < string.length; column++) {
                System.out.print(string[row][column] + " ");
            }
        }
    }

    public static void populate2DArray(String[][] string) {
        Integer counter = 0;
        Integer displayInt = 0;
        for (Integer row = 0; row < string.length; row++) {
            counter++;
            displayInt = counter;
            for (Integer column = 0; column < string.length; column++) {
                if (column >= string.length - counter) {
                    string[row][column] = displayInt.toString();
                    displayInt--;
                }
                else {
                    string[row][column] = "x";
                }
            }
        }
    }
}
