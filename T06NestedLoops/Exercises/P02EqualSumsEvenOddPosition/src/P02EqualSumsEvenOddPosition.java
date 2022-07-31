import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= lastNumber ; i++) {
            int tempNumber = i;
            int sumEven = 0;
            int sumOdd = 0;

            for (int position = 1; position <= 6; position++) {
                if (position % 2 == 0) {
                    sumEven += tempNumber % 10;
                } else {
                    sumOdd +=  tempNumber % 10;
                }
                tempNumber /= 10;
            }
            if (sumEven == sumOdd) {
                System.out.printf("%d ", i);
            }
        }

    }
}
