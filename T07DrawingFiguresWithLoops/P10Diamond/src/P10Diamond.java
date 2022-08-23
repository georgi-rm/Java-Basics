import java.util.Scanner;

public class P10Diamond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder line;

        int leftRightDashes = (n - 1) / 2;

        for (int row = 0; row < n; row++) {
            line = new StringBuilder();

            int midDashes = n - 2 * leftRightDashes - 2;

            line.append("-".repeat(Math.max(0, leftRightDashes)));

            line.append("*");

            line.append("-".repeat(Math.max(0, midDashes)));

            if (midDashes >= 0) {
                line.append("*");
            }

            line.append("-".repeat(Math.max(0, leftRightDashes)));

            System.out.println(line);

            if (row < (n - 1) / 2) {
                leftRightDashes--;
            } else {
                leftRightDashes++;
            }

            if (leftRightDashes > (n - 1) / 2) {
                break;
            }
        }
    }
}
