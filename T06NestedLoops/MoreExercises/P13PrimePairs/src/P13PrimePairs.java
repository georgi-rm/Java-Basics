import java.util.Scanner;

public class P13PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginOfIntervalForFirstPair = Integer.parseInt(scanner.nextLine());
        int beginOfIntervalForSecondPair = Integer.parseInt(scanner.nextLine());
        int differenceForFirstPair = Integer.parseInt(scanner.nextLine());
        int differenceForSecondPair = Integer.parseInt(scanner.nextLine());

        for (int firstPair = beginOfIntervalForFirstPair; firstPair <= beginOfIntervalForFirstPair + differenceForFirstPair; firstPair++) {
            for (int secondPair = beginOfIntervalForSecondPair; secondPair <= beginOfIntervalForSecondPair + differenceForSecondPair; secondPair++) {

                if (isPrime(firstPair) && isPrime(secondPair)) {
                    System.out.printf("%d%d%n", firstPair, secondPair);
                }
            }
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
