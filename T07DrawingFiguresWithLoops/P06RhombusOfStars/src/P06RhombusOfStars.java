import java.util.Scanner;

public class P06RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            printLine(row, n - row);
        }

        for (int row = n - 1; row > 0; row--) {
            printLine(row, n - row);
        }
    }

    public static void printLine(int lineNumber, int countOfLeadingSpaces) {

        String line = " ".repeat(Math.max(0, countOfLeadingSpaces)) +
                "* ".repeat(Math.max(0, lineNumber));

        System.out.println(line);
    }
}
