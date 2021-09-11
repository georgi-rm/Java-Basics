import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        int combination = 0;
        int saveI = 0;
        int saveJ = 0;

        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                combination++;
                if ( i + j == magicNumber) {
                    isFound = true;
                    saveI = i;
                    saveJ = j;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", combination, saveI, saveJ, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }
    }
}
