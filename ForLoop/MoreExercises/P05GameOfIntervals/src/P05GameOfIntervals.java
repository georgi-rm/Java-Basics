import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfRounds = Integer.parseInt(scanner.nextLine());

        double points = 0;
        int countInvalidNumbers = 0;
        int countNumbers0To9 = 0;
        int countNumbers10To19 = 0;
        int countNumbers20To29 = 0;
        int countNumbers30To39 = 0;
        int countNumbers40To50 = 0;

        for (int i = 0; i < countOfRounds; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 0 || number > 50) {
                points /= 2;
                countInvalidNumbers++;
            } else if (number < 10) {
                points += number * 0.2;
                countNumbers0To9++;
            } else if (number < 20) {
                points += number * 0.3;
                countNumbers10To19++;
            } else if (number < 30) {
                points += number * 0.4;
                countNumbers20To29++;
            } else if (number < 40) {
                points += 50;
                countNumbers30To39++;
            } else {
                points += 100;
                countNumbers40To50++;
            }
        }

        double percentageInvalidNumbers = 100.0 * countInvalidNumbers / countOfRounds;
        double percentageNumbers0To9 = 100.0 * countNumbers0To9 / countOfRounds;
        double percentageNumbers10To19 = 100.0 * countNumbers10To19 / countOfRounds;
        double percentageNumbers20To29 = 100.0 * countNumbers20To29 / countOfRounds;
        double percentageNumbers30To39 = 100.0 * countNumbers30To39 / countOfRounds;
        double percentageNumbers40To50 = 100.0 * countNumbers40To50 / countOfRounds;

        System.out.printf("%.2f\n", points);
        System.out.printf("From 0 to 9: %.2f%%\n", percentageNumbers0To9);
        System.out.printf("From 10 to 19: %.2f%%\n", percentageNumbers10To19);
        System.out.printf("From 20 to 29: %.2f%%\n", percentageNumbers20To29);
        System.out.printf("From 30 to 39: %.2f%%\n", percentageNumbers30To39);
        System.out.printf("From 40 to 50: %.2f%%\n", percentageNumbers40To50);
        System.out.printf("Invalid numbers: %.2f%%", percentageInvalidNumbers);
    }
}
