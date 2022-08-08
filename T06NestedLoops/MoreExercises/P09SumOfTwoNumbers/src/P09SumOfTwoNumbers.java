import java.util.Scanner;

public class P09SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countOfCombinations = 0;

        for (int firstNumber = beginOfInterval; firstNumber <= endOfInterval; firstNumber++) {

            for (int secondNumber = beginOfInterval; secondNumber <= endOfInterval; secondNumber++) {
                countOfCombinations++;

                if (firstNumber + secondNumber == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", countOfCombinations, firstNumber, secondNumber, magicNumber);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d", countOfCombinations, magicNumber);
    }
}
