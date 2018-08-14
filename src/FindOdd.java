import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] numberArray) {
        int counter = 0;
        HashMap<Integer, Integer> numberCounter = new HashMap<>();
        for(int i =0; i<numberArray.length;i++){
            //check to see if the key exists in the map
            //if it does
            //then put in the key and ++ the value
            //else put in the key and the value is 1 b/c it was not in the hashmap
            if (numberCounter.containsKey(numberArray[i])){
                int currentValue = numberCounter.get(numberArray[i]);
                currentValue += 1;
                numberCounter.put(numberArray[i],currentValue);
            }else {
                numberCounter.put(numberArray[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numberCounter.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + " value = " + value);

            if (value%2 == 1) {
                return key;
            }

        }




        return 0;
    }
}
