package conditionalstatementsadvanced.exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberDays = Integer.parseInt(scanner.nextLine());

        double totalApartment = 0;
        double totalStudio = 0;

        switch (month) {
            case "May":
            case "October":
                totalStudio = 50 * numberDays;
                totalApartment = 65 * numberDays;
                if ( numberDays > 14 ) {
                    totalStudio -= 0.3 * totalStudio;
                    totalApartment -= 0.1 * totalApartment;
                } else if(numberDays > 7){
                    totalStudio -= 0.05 * totalStudio;
                }
                break;
            case "June":
            case "September":
                totalStudio = 75.20 * numberDays;
                totalApartment = 68.70 * numberDays;
                if ( numberDays > 14 ) {
                    totalStudio -= 0.2 * totalStudio;
                    totalApartment -= 0.1 * totalApartment;
                }
                break;
            case "July":
            case "August":
                totalStudio = 76 * numberDays;
                totalApartment = 77 * numberDays;
                if ( numberDays > 14 ) {
                    totalApartment -= 0.1 * totalApartment;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n" +
                "Studio: %.2f lv.", totalApartment, totalStudio);
    }
}
