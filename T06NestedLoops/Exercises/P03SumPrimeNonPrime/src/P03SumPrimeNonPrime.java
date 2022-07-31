import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isPrime = true;
            for (int i = 2; i < number ; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if ( number < 0) {
                System.out.printf("Number is negative.%n");
            } else if (isPrime) {
                sumPrime += number;
            } else {
                sumNonPrime += number;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}
