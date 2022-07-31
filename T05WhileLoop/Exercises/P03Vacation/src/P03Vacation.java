import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double moneyAtStart = Double.parseDouble(scanner.nextLine());
        double money = moneyAtStart;
        int consecutiveSpendDays = 0;
        int totalDays = 0;
        boolean isFailed = false;

        while (money < excursionPrice) {
            String action = scanner.nextLine();
            double value = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                money -= value;
                if (money < 0) {
                    money = 0;
                }
                consecutiveSpendDays++;
            } else if (action.equals("save")) {
                money += value;
                consecutiveSpendDays = 0;
            }
            totalDays++;
            if (consecutiveSpendDays >= 5) {
                isFailed = true;
                break;
            }
        }

        if (isFailed) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
