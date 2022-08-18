import java.util.Scanner;

public class P05SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char sideSymbol = '|';

            if (i == 0 || i == n - 1) {
                sideSymbol = '+';
            }

            System.out.printf("%c ", sideSymbol);

            for (int j = 0; j < n - 2; j++) {
                System.out.print("- ");
            }
            System.out.printf("%c%n", sideSymbol);
        }
    }
}
