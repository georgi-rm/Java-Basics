import java.util.Scanner;

public class P10Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfCoinsOneLev = Integer.parseInt(scanner.nextLine());
        int countOfCoinsTwoLevs = Integer.parseInt(scanner.nextLine());
        int countOfCoinsFiveLevs = Integer.parseInt(scanner.nextLine());
        int sumToPay = Integer.parseInt(scanner.nextLine());

        for (int quantityOfOneLev = 0; quantityOfOneLev <= countOfCoinsOneLev; quantityOfOneLev++) {
            for (int quantityOfTwoLevs = 0; quantityOfTwoLevs <= countOfCoinsTwoLevs; quantityOfTwoLevs++) {
                for (int quantityOfFiveLevs = 0; quantityOfFiveLevs <= countOfCoinsFiveLevs; quantityOfFiveLevs++) {
                    if (quantityOfOneLev + quantityOfTwoLevs * 2 + quantityOfFiveLevs * 5 == sumToPay) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", quantityOfOneLev, quantityOfTwoLevs, quantityOfFiveLevs, sumToPay);
                    }
                }
            }
        }
    }
}
