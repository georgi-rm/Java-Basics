import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());

        int beginNumber = beginInterval;
        int endNumber = endInterval;

        int beginForthDigit = beginNumber % 10;
        beginNumber /= 10;
        int beginThirdDigit = beginNumber % 10;
        beginNumber /= 10;
        int beginSecondDigit = beginNumber % 10;
        beginNumber /= 10;
        int beginFirstDigit = beginNumber % 10;

        int endForthDigit = endNumber % 10;
        endNumber /= 10;
        int endThirdDigit = endNumber % 10;
        endNumber /= 10;
        int endSecondDigit = endNumber % 10;
        endNumber /= 10;
        int endFirstDigit = endNumber % 10;


        for (int i = beginFirstDigit; i <= endFirstDigit; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = beginSecondDigit; j <= endSecondDigit; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                for (int k = beginThirdDigit; k <= endThirdDigit; k++) {
                    if (k % 2 == 0) {
                        continue;
                    }
                    for (int l = beginForthDigit; l <= endForthDigit; l++) {
                        if (l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
