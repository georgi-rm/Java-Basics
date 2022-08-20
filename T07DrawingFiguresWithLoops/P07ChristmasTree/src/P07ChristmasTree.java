import java.util.Scanner;

public class P07ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row <= n; row++) {

            String line = " ".repeat(Math.max(0, n - row)) +
                    "*".repeat(Math.max(0, row)) +
                    " | " +
                    "*".repeat(Math.max(0, row));
            System.out.println(line);
        }
    }
}
