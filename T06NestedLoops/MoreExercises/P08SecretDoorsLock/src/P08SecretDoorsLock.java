import java.util.Scanner;

public class P08SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimitHundreds = Integer.parseInt(scanner.nextLine());
        int upperLimitTenths = Integer.parseInt(scanner.nextLine());
        int upperLimitOnes = Integer.parseInt(scanner.nextLine());

        for (int hundreds = 2; hundreds <= upperLimitHundreds; hundreds += 2) {

            for (int tenths = 2; tenths <= Math.min(upperLimitTenths, 7); tenths++) {

                boolean isPrime = true;

                for (int i = 2; i < tenths; i++) {
                    if (tenths % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (!isPrime) {
                    continue;
                }

                for (int ones = 2; ones <= upperLimitOnes; ones += 2) {
                    System.out.printf("%d %d %d%n", hundreds, tenths, ones);
                }
            }
        }
    }
}
