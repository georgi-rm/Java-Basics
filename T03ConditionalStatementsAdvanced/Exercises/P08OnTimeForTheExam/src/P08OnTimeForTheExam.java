package conditionalstatementsadvanced.exercise;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;

        int timeDifference = Math.abs( examTime - arriveTime);

        if ( arriveTime > examTime) {
            if (timeDifference < 60) {
                System.out.printf("Late\n" +
                        "%d minutes after the start", timeDifference);
            } else {
                System.out.printf("Late\n" +
                        "%d:%02d hours after the start", timeDifference / 60, timeDifference % 60);
            }
        } else if ( timeDifference <= 30) {
            System.out.printf("On time\n" +
                    "%d minutes before the start", timeDifference);
        } else {
            if (timeDifference < 60) {
                System.out.printf("Early\n" +
                        "%d minutes before the start", timeDifference);
            } else {
                System.out.printf("Early\n" +
                        "%d:%02d hours before the start", timeDifference / 60, timeDifference % 60);
            }
        }

    }
}
