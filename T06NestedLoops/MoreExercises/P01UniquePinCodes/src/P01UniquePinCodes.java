import java.util.Scanner;

public class P01UniquePinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimitOfFirstDigit = Integer.parseInt(scanner.nextLine());
        int upperLimitOfSecondDigit = Integer.parseInt(scanner.nextLine());
        int upperLimitOfThirdDigit = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = 2; firstDigit <= upperLimitOfFirstDigit; firstDigit += 2) {
            for (int secondDigit = 2; secondDigit <= upperLimitOfSecondDigit; secondDigit++) {
                boolean isPrime = true;
                for (int i = 2; i < secondDigit; i++) {
                    if (secondDigit % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (!isPrime) {
                    continue;
                }

                for (int thirdDigit = 2; thirdDigit <= upperLimitOfThirdDigit; thirdDigit += 2) {
                    System.out.printf("%d %d %d%n", firstDigit, secondDigit, thirdDigit);
                }
            }
        }
    }
}
