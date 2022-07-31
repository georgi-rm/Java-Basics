package conditionalstatements.exercise;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secondsPlayer1 = Integer.parseInt(scanner.nextLine());
        int secondsPlayer2 = Integer.parseInt(scanner.nextLine());
        int secondsPlayer3 = Integer.parseInt(scanner.nextLine());

        int totalSeconds = secondsPlayer1 + secondsPlayer2 + secondsPlayer3;
        int seconds = totalSeconds % 60;

        if (seconds < 10) {
            System.out.println(totalSeconds / 60 + ":0" + seconds);
        }
        else {
            System.out.println(totalSeconds / 60 + ":" + seconds);
        }
    }
}
