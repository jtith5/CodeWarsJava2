public class Redacted {
    public static boolean redacted(String redactedDocument, String originalDocument) {
        System.out.println("Redacted Document = " + redactedDocument);
        System.out.println("Original Document = " + originalDocument);
        if (totalCharacterCount(redactedDocument) != totalCharacterCount(originalDocument)) {
            return false;
        }
        return allCharactersMatchThatArentRedacted(redactedDocument, originalDocument);
    }

    public static int totalCharacterCount(String document) {
        int numberOfCharaters = 0;
        for (int i = 0; i < document.length(); i++) {
            numberOfCharaters++;
        }
        return numberOfCharaters;
    }

    public static boolean allCharactersMatchThatArentRedacted(String redactedDocument, String originalDocument) {
        for (int i = 0; i < originalDocument.length(); i++) {
            if (redactedDocument.charAt(i) != 'X') {
                Character redactedCharacter = redactedDocument.charAt(i);
                Character originalCharacter = originalDocument.charAt(i);
                System.out.println("Comparing " + redactedCharacter + " with " + originalCharacter);
                if (!redactedCharacter.equals(originalCharacter)) {
                    return false;
                }
            }
        }
        return true;
    }
}
