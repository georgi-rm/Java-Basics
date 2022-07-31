package conditionalstatements.moreexercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysHoliday = Integer.parseInt(scanner.nextLine());
        int minutesPlay = daysHoliday * 127 + (365 - daysHoliday ) * 63;

        int minutesDifference = Math.abs(30000 - minutesPlay);

        if (minutesPlay > 30000) {
            System.out.printf("Tom will run away%n");
            System.out.printf("%d hours and %d minutes more for play", minutesDifference / 60, minutesDifference % 60);
        } else {
            System.out.printf("Tom sleeps well%n");
            System.out.printf("%d hours and %d minutes less for play", minutesDifference / 60, minutesDifference % 60);
        }




    }
}
