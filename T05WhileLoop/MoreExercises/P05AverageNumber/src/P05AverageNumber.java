import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(scanner.nextLine());
        }

        Double average = 1.0 * sum / n;
        System.out.printf("%.2f", average);
    }
}
