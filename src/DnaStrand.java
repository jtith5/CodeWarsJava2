public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder makeComplement = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') {
                makeComplement.append('T');

            } else if (dna.charAt(i) == 'T') {
                makeComplement.append('A');
            } else if (dna.charAt(i) == 'C') {
                makeComplement.append('G');
            } else if (dna.charAt(i) == 'G') {
                makeComplement.append('C');
            }
        }

        return makeComplement.toString();
    }
}
