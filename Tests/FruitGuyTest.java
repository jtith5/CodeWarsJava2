import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FruitGuyTest {

    @Test
    public void removeRotten() {
        //Given the fruit basket below with rotten fruit
        String[] fruitBasket = {"rottengrape", "grape","rottenapple","orange"};

        //After invoking the method to remove rotten fruit shown below
        String[] newFruitBasket = FruitGuy.removeRotten(fruitBasket);

        //I expected that the fruit will be removed and will look like the variable below
        String[] expectedFruitBasket = {"grape","grape", "apple", "orange"};

        //I will assert them to make sure that that is the case
        Assert.assertEquals(expectedFruitBasket, newFruitBasket);
    }

    @Test
    public void isRottenFruit() {
        String fruitSample = "kiwi";

         boolean actual = FruitGuy.isRottenFruit(fruitSample);

         Assert.assertFalse(actual);
    }

    @Test
    public void isRottenFruit2(){
        String fruitSample = "rottenapple";

        boolean actual = FruitGuy.isRottenFruit(fruitSample);

        Assert.assertTrue(actual);
    }


}