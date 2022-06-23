import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfDetergentBottles = Integer.parseInt(scanner.nextLine());

        int volumeOfDetergent = countOfDetergentBottles * 750;
        int detergentUsed = 0;
        boolean isDetergentFinished = false;

        int quantityOfPlates = 0;
        int quantityOfPots = 0;

        String command = scanner.nextLine();

        int countOfLoads = 0;

        while (!command.equals("End")) {
            countOfLoads++;
            int quantityOfDishes = Integer.parseInt(command);

            if (countOfLoads % 3 == 0) {
                detergentUsed += quantityOfDishes * 15;
                quantityOfPots += quantityOfDishes;
            } else {
                detergentUsed += quantityOfDishes * 5;
                quantityOfPlates += quantityOfDishes;
            }

            if (detergentUsed > volumeOfDetergent) {
                isDetergentFinished = true;
                break;
            }
            command = scanner.nextLine();
        }

        int detergentDifference = Math.abs(volumeOfDetergent - detergentUsed);

        if (isDetergentFinished) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", detergentDifference);
        } else {
            System.out.printf("Detergent was enough!\n%d dishes and %d pots were washed.\nLeftover detergent %d ml.",
                    quantityOfPlates, quantityOfPots, detergentDifference);
        }
    }
}
