import java.lang.reflect.Array;
import java.util.Arrays;

public class FruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {

        if (fruitBasket == null){
            return new String[0];


        }

        System.out.println(Arrays.toString(fruitBasket));

        for (int i = 0; i<fruitBasket.length; i++){
            System.out.println(fruitBasket[i]);
            System.out.println(isRottenFruit(fruitBasket[i]));
            if(isRottenFruit(fruitBasket[i])){
                fruitBasket[i] = fruitBasket[i].substring(6).toLowerCase();

            }
        }
        System.out.println(Arrays.toString(fruitBasket));





        return fruitBasket;

    }

    public static boolean isRottenFruit(String fruitSample){
        return fruitSample.contains("rotten");
    }
}
