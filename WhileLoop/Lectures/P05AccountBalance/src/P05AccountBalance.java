import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        String input = scanner.nextLine();

        while (!input.equals("NoMoreMoney")) {
            double money = Double.parseDouble(input);
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            balance += money;
            System.out.printf("Increase: %.2f%n", money);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", balance);
    }
}
