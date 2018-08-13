public class BumpsTheRoad {
    public static String bumps(final String road) {
        int bumpcounter = 0;
        for (int i = 0; i<road.length(); i++){
            if (road.charAt(i) == 'n'){
                bumpcounter++;
            }
        }
        if (bumpcounter <= 15){
            return  "Woohoo!";
        }
        return "Car Dead";
    }
}
