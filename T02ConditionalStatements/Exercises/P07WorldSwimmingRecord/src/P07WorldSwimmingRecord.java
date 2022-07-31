package conditionalstatements.exercise;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double secondsTotal = distance * secondsPerMeter;

        double sectors = Math.floor(distance / 15);
        double delay = sectors * 12.5;

        secondsTotal = secondsTotal + delay;

        if( secondsTotal < record ) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", secondsTotal);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", secondsTotal - record);
        }
    }
}
