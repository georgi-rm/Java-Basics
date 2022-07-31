package conditionalstatementsadvanced.exercise;

import java.util.Scanner;

public class P09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int homeWeekends = Integer.parseInt(scanner.nextLine());

        double daysToPlay = holidays * 2.0 / 3 + (48 - homeWeekends) * 3.0 / 4 + homeWeekends;

        if (year.equals("leap")) {
            daysToPlay *= 1.15;
        }
        System.out.printf("%.0f", Math.floor(daysToPlay));

    }
}
