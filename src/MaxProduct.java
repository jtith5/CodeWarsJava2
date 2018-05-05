import java.util.ArrayList;
import java.util.Collections;

public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        ArrayList <Integer> products = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++){
            System.out.println("multiplying " + array[i] + " * " + array[i+1] + " = " + array[i]*array[i+1]);
            products.add(array[i] * array[i+1]);
        }
        System.out.println("\nNow printing everything in products ArrayList.");
        for (Integer element: products){
            System.out.println(element);
        }
        System.out.println();
       return Collections.max(products);

    }

}
