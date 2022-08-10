import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfDays = Integer.parseInt(scanner.nextLine());
        int countOfHoursPerDay = Integer.parseInt(scanner.nextLine());

        double total = 0;

        for (int day = 1; day <= countOfDays; day++) {
            double dayTotal = 0;

            for (int hour = 1; hour <= countOfHoursPerDay; hour++) {
                if (day % 2 == 0 && hour % 2 != 0) {
                    dayTotal += 2.50;
                } else if (day % 2 != 0 && hour % 2 == 0) {
                    dayTotal += 1.25;
                } else {
                    dayTotal += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", day, dayTotal);
            total += dayTotal;
        }

        System.out.printf("Total: %.2f leva", total);
    }
}
