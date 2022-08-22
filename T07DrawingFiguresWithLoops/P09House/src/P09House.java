import java.util.Scanner;

public class P09House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder line;

        for (int row = 0; row < (n + 1) / 2; row++) {
            line = new StringBuilder();
            int initialStars = (n % 2 == 0) ? 2 : 1;

            String dashes = "-".repeat(Math.max(0, (n - (initialStars + 2 * row)) / 2));
            line.append(dashes);
            line.append("*".repeat(initialStars + 2 * row));
            line.append(dashes);
            System.out.println(line);
        }

        line = new StringBuilder("|");
        line.append("*".repeat(Math.max(0, n - 2)));
        line.append("|");

        for (int row = 0; row <= n / 2 - 1; row++) {
            System.out.println(line);
        }
    }
}
