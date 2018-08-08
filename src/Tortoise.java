import java.util.Arrays;

public class Tortoise {
    public static int[] race(int speedA, int speedB, int Headstart) {
        if (speedA >= speedB) {
            return null;
        }

        int finalTimeInSeconds;

        finalTimeInSeconds = (Headstart)*3600/(speedB - speedA);

        System.out.println(finalTimeInSeconds);

        System.out.println(Arrays.toString(timeArrayConversion(finalTimeInSeconds)));

        return timeArrayConversion(finalTimeInSeconds);
    }

    public static int[] timeArrayConversion(int seconds) {
        int[] HrsMinSec = {0, 0, 0};

        if (seconds < 60) {
            HrsMinSec[2] = seconds;
        } else if (seconds < 3600) {
            HrsMinSec[1] = seconds / 60;
            HrsMinSec[2] = seconds % 60;
        } else {
            HrsMinSec[0] = seconds / 3600;
            HrsMinSec[1] = (seconds % 3600) / 60;
            HrsMinSec[2] = (seconds % 3600) % 60;
        }
        return HrsMinSec;
    }
}


// final distance = speedA(time) + HeadStart
// Final distance = speedB(time)
// speedA(time) + HeadStart = speedB(time)
// HeadStart = speedB(time) - speedA(time)
// HeadStart = (time)(speedB - speedA)
// (HeadStart)/(speedB - speedA) = time