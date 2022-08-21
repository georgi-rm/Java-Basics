import java.util.Scanner;

public class P08Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder line = new StringBuilder();
        line.append("*".repeat(Math.max(0, n * 2)));
        line.append(" ".repeat(Math.max(0, n)));
        line.append("*".repeat(Math.max(0, n * 2)));
        System.out.println(line);

        for (int row = 0; row < n - 2; row++) {
            line = new StringBuilder("*");

            String upAndDownBorder = "/".repeat(Math.max(0, 2 * n - 2));
            line.append(upAndDownBorder);

            line.append("*");

            for (int i = 0; i < n; i++) {
                if (row == ((n - 1) / 2) - 1) {
                    line.append("|");
                } else {
                    line.append(" ");
                }
            }

            line.append("*");

            line.append(upAndDownBorder);

            line.append("*");
            System.out.println(line);
        }

        line = new StringBuilder();
        line.append("*".repeat(Math.max(0, n * 2)));
        line.append(" ".repeat(Math.max(0, n)));
        line.append("*".repeat(Math.max(0, n * 2)));
        System.out.println(line);
    }
}
