import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char beginChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);
        char skipChar = scanner.nextLine().charAt(0);

        int countOfCombinations = 0;

        for (char firstChar = beginChar; firstChar <= endChar; firstChar++) {
            if (firstChar == skipChar) {
                continue;
            }

            for (char secondChar = beginChar; secondChar <= endChar; secondChar++) {
                if (secondChar == skipChar) {
                    continue;
                }

                for (char thirdChar = beginChar; thirdChar <= endChar; thirdChar++) {
                    if (thirdChar == skipChar) {
                        continue;
                    }

                    countOfCombinations++;
                    System.out.printf("%c%c%c ", firstChar, secondChar, thirdChar);
                }
            }
        }

        System.out.print(countOfCombinations);
    }
}
