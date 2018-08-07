import java.lang.StringBuilder;

public class ConvertingToCamelCase {
    static String toCamelCase(String s) {
        StringBuilder camelCase = new StringBuilder();
//            if (Character.isLetter(s.charAt(0))){
//              camelCase.append(Character.toUpperCase(s.charAt(0)));
//            }
        boolean capitalizeNextLetter = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (capitalizeNextLetter) {
                    camelCase.append(Character.toUpperCase(s.charAt(i)));
                    capitalizeNextLetter = false;
                } else {
                    camelCase.append(s.charAt(i));
                }
            } else {
                capitalizeNextLetter = true;

            }
        }
        return camelCase.toString();
    }
}
