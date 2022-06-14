import java.util.Scanner;

public class P11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfNumbers = Integer.parseInt(scanner.nextLine());


        double oddSum = 0;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenSum = 0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;


        for (int i = 1; i <= countOfNumbers; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += currentNumber;

                if (currentNumber < evenMin) {
                    evenMin = currentNumber;
                }

                if (currentNumber > evenMax) {
                    evenMax = currentNumber;
                }
            } else {
                oddSum += currentNumber;

                if (currentNumber < oddMin) {
                    oddMin = currentNumber;
                }

                if (currentNumber > oddMax) {
                    oddMax = currentNumber;
                }
            }
        }

        String oddMinOutput = "No";
        String oddMaxOutput = "No";
        String evenMinOutput = "No";
        String evenMaxOutput = "No";

        if (oddMin != Double.POSITIVE_INFINITY) {
            oddMinOutput = String.format("%.2f", oddMin);
        }
        if (oddMax != Double.NEGATIVE_INFINITY) {
            oddMaxOutput = String.format("%.2f", oddMax);
        }
        if (evenMin != Double.POSITIVE_INFINITY) {
            evenMinOutput = String.format("%.2f", evenMin);
        }
        if (evenMax != Double.NEGATIVE_INFINITY) {
            evenMaxOutput = String.format("%.2f", evenMax);
        }

        System.out.printf("OddSum=%.2f,\n", oddSum);
        System.out.printf("OddMin=%s,\n", oddMinOutput);
        System.out.printf("OddMax=%s,\n", oddMaxOutput);
        System.out.printf("EvenSum=%.2f,\n", evenSum);
        System.out.printf("EvenMin=%s,\n", evenMinOutput);
        System.out.printf("EvenMax=%s", evenMaxOutput);
    }
}
