public class EasyWallpaper {

    public String wallpaper(double l, double w, double h) {
        System.out.println("lenth: " + l);
        System.out.println("width: " + w);
        System.out.println("height: " + h);
        l = l * 1.15;
        w = w * 1.15;
        double areaNeeded = (l * h * 2) + (w * h * 2);
        double areaWallpaper = 5.2;
        Integer rollsToBuy = (int) Math.ceil(areaNeeded / areaWallpaper);
        String numberofRolls = "";
        if (l == 0 || w == 0 || h == 0) {
            return "zero";
        }

        switch (rollsToBuy) {
            case 1:
                numberofRolls = "one";
                break;
            case 2:
                numberofRolls = "two";
                break;
            case 3:
                numberofRolls = "three";
                break;
            case 4:
                numberofRolls = "four";
                break;
            case 5:
                numberofRolls = "five";
                break;
            case 6:
                numberofRolls = "six";
                break;
            case 7:
                numberofRolls = "seven";
                break;
            case 8:
                numberofRolls = "eight";
                break;
            case 9:
                numberofRolls = "nine";
                break;
            case 10:
                numberofRolls = "ten";
                break;
            case 11:
                numberofRolls = "eleven";
                break;
            case 12:
                numberofRolls = "twelve";
                break;
            case 13:
                numberofRolls = "thirteen";
                break;
            case 14:
                numberofRolls = "fourteen";
                break;
            case 15:
                numberofRolls = "fifteen";
                break;
            case 16:
                numberofRolls = "sixteen";
                break;
            case 17:
                numberofRolls = "seventeen";
                break;
            case 18:
                numberofRolls = "eighteen";
                break;
            case 19:
                numberofRolls = "nineteen";
                break;
            case 20:
                numberofRolls = "twenty";
                break;
            default:
                numberofRolls = "Error - higher than 20.";
        }
        System.out.println(rollsToBuy);


        return numberofRolls;
    }
}

//    all rolls (even with incomplete width) are put edge to edge
//0 <= l, w, h (floating numbers), it can happens that w x h x l is zero
//        the integer r (number of rolls) will always be less or equal to 20