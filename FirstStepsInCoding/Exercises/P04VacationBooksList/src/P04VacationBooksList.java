package firststeps.exercise;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int dayToReadTheBook = Integer.parseInt(scanner.nextLine());

        int timeToReadBook = pagesInBook / pagesPerHour;
        int hoursPerDay = timeToReadBook / dayToReadTheBook;
        System.out.println(hoursPerDay);
    }
}
