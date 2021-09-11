import java.util.Scanner;

public class P07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int totalStudentTickets = 0;
        int totalStandardTickets = 0;
        int totalKidsTickets = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int takenSeats = 0;

            while ( takenSeats < freeSeats ){
                String ticket = scanner.nextLine();
                if (ticket.equals("End")) {
                    break;
                } else if (ticket.equals("student")) {
                    takenSeats++;
                    totalStudentTickets++;
                } else if (ticket.equals("standard")) {
                    takenSeats++;
                    totalStandardTickets++;
                } else if (ticket.equals("kid")) {
                    takenSeats++;
                    totalKidsTickets++;
                }
            }
            System.out.printf("%s - %.2f%% full.%n", input, 100.0 * takenSeats / freeSeats);
            input = scanner.nextLine();
        }
        totalTickets = totalKidsTickets + totalStandardTickets + totalStudentTickets;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 100.0 * totalStudentTickets / totalTickets);
        System.out.printf("%.2f%% standard tickets.%n", 100.0 * totalStandardTickets / totalTickets);
        System.out.printf("%.2f%% kids tickets.%n", 100.0 * totalKidsTickets / totalTickets);

    }
}
