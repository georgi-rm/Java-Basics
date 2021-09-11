import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double excursionPrice = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < excursionPrice) {
                sum += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!%n", input);
            input = scanner.nextLine();
        }
    }
}
