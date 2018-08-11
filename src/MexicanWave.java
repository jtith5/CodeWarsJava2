import java.util.Arrays;

public class MexicanWave {
    public static String[] wave(String word) {
        System.out.println("Word = $" + word + "$");
        word = word.toLowerCase();
        String[] wordWave = new String[word.trim().length() - countSpaces(word)];
        int counter = 0;
        for (int index = 0; index < word.length(); index++) {
//            Character currentCharacter = word.charAt(index);
//            if (currentCharacter == ' ') {
//                System.out.println("Current Character is a space!");
//            }
//            else {
//                System.out.println("Current Character is: " + currentCharacter);
//            }
//            System.out.println("Building Mexican Wave!");
            String wave = MexicanWave.makeWave(word, index);
//            System.out.println("Wave is: " + wave);
            if (wave != null) {
//                System.out.println("Adding " + wave + " to word wave!");
                wordWave[counter] = wave;
                counter++;
            }
//            System.out.println();
        }
        System.out.println(Arrays.toString(wordWave));
        return wordWave;
    }

    public static String makeWave(String stringToBeWaved, int characterToBeUpperCasedIndex) {
        if (stringToBeWaved.substring(characterToBeUpperCasedIndex, characterToBeUpperCasedIndex + 1).equals(" ")) {
            return null;
        }
        //First Letter
        if (characterToBeUpperCasedIndex == 0) {
            return stringToBeWaved.substring(0, 1).toUpperCase() + stringToBeWaved.substring(1);
        }
        //Last Letter
        else if (characterToBeUpperCasedIndex == stringToBeWaved.length() - 1) {
            return stringToBeWaved.substring(0, stringToBeWaved.length() - 1) + stringToBeWaved.substring(stringToBeWaved.length() - 1).toUpperCase();
        }
        //Letter in between
        else {
            return stringToBeWaved.substring(0, characterToBeUpperCasedIndex) + stringToBeWaved.substring(characterToBeUpperCasedIndex, characterToBeUpperCasedIndex + 1).toUpperCase() +
                    stringToBeWaved.substring(characterToBeUpperCasedIndex + 1);
        }
    }

    public static int countSpaces(String word) {
        word = word.trim();
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter;
    }

}

