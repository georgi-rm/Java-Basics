import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPairs = Integer.parseInt(scanner.nextLine());

        int previousPairValue = Integer.parseInt(scanner.nextLine());
        previousPairValue += Integer.parseInt(scanner.nextLine());
        int maximumDifference = 0;

        for (int i = 1; i < countOfPairs; i++) {
            int pairValue = Integer.parseInt(scanner.nextLine());
            pairValue += Integer.parseInt(scanner.nextLine());

            int currentDifference = Math.abs(previousPairValue - pairValue);

            if (currentDifference > maximumDifference) {
                maximumDifference = currentDifference;
            }

            previousPairValue = pairValue;
        }

        if (maximumDifference == 0) {
            System.out.printf("Yes, value=%d", previousPairValue);
        } else {
            System.out.printf("No, maxdiff=%d", maximumDifference);
        }
    }
}
