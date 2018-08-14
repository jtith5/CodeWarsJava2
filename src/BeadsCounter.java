public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        if (nBlue == 0 ){
            return 0;
        } else if (nBlue == 1){
            return 0;
        }
        return (2*nBlue - 2);
    }
}
