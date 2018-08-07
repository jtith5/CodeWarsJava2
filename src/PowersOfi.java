public class PowersOfi {
    public static String pofi(int n) {
        while (n >= 4) {
            n -= 4;
        }
        if (n == 0) {
            return "1";
        } else if (n == 1) {
            return "i";
        } else if (n == 2) {
            return "-1";
        }
        return "-i";
    }
}
