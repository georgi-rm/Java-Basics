import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumToCollect = Integer.parseInt(scanner.nextLine());

        int collectedSum = 0;
        boolean isSumCollected = false;

        int payedInCash = 0;
        int payedWithCard = 0;

        int countPayedInCash = 0;
        int countPayedWithCard = 0;

        String command = scanner.nextLine();

        int countOfRounds = 0;

        while (!command.equals("End")) {
            countOfRounds++;
            int paymentAmount = Integer.parseInt(command);

            if (countOfRounds % 2 == 0) {
                if (paymentAmount < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedSum += paymentAmount;
                    payedWithCard += paymentAmount;
                    countPayedWithCard++;
                }
            } else {
                if (paymentAmount > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedSum += paymentAmount;
                    payedInCash += paymentAmount;
                    countPayedInCash++;
                }
            }

            if (collectedSum >= sumToCollect) {
                isSumCollected = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (isSumCollected) {
            double averageInCash = 1.0 * payedInCash / countPayedInCash;
            double averageWithCard = 1.0 * payedWithCard / countPayedWithCard;

            System.out.printf("Average CS: %.2f\n" +
                            "Average CC: %.2f",
                    averageInCash, averageWithCard);
        } else {
            System.out.print("Failed to collect required money for charity.");
        }
    }
}
