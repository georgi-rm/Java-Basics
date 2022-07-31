import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        int countTicketsAdults = Integer.parseInt(scanner.nextLine());
        int countTicketsKids = Integer.parseInt(scanner.nextLine());
        double priceAdultTicket = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());

        double priceKidTicketWithTax = priceAdultTicket * 0.3 + serviceTax;
        double priceAdultTicketWithTax = priceAdultTicket + serviceTax;

        double total = countTicketsAdults * priceAdultTicketWithTax + countTicketsKids * priceKidTicketWithTax;

        total *= 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, total);
    }
}
