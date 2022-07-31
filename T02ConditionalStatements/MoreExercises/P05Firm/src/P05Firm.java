package conditionalstatements.moreexercises;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int requiredHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double workHours = Math.floor(days * 0.9 * 8 + days * 2 * workers);

        double hoursDifference = Math.abs(requiredHours - workHours);
        if (workHours >= requiredHours) {
            System.out.printf("Yes!%.0f hours left.", hoursDifference);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hoursDifference);
        }

    }
}
