import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeOfGroup = scanner.nextLine();
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        String typeOfSport = "";
        double priceForOvernight = 0;

        switch (season) {
            case "Winter":
                switch (typeOfGroup) {
                    case "girls":
                        priceForOvernight = 9.60;
                        typeOfSport = "Gymnastics";
                        break;
                    case "boys":
                        priceForOvernight = 9.60;
                        typeOfSport = "Judo";
                        break;
                    case "mixed":
                        priceForOvernight = 10;
                        typeOfSport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (typeOfGroup) {
                    case "girls":
                        priceForOvernight = 7.20;
                        typeOfSport = "Athletics";
                        break;
                    case "boys":
                        priceForOvernight = 7.20;
                        typeOfSport = "Tennis";
                        break;
                    case "mixed":
                        priceForOvernight = 9.50;
                        typeOfSport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (typeOfGroup) {
                    case "girls":
                        priceForOvernight = 15;
                        typeOfSport = "Volleyball";
                        break;
                    case "boys":
                        priceForOvernight = 15;
                        typeOfSport = "Football";
                        break;
                    case "mixed":
                        priceForOvernight = 20;
                        typeOfSport = "Swimming";
                        break;
                }
                break;
        }

        double finalPrice = priceForOvernight * numberOfStudents * numberOfNights;

        if (numberOfStudents >= 50) {
            finalPrice *= 0.50;
        } else if (numberOfStudents >= 20) {
            finalPrice *= 0.85;
        } else if (numberOfStudents >= 10) {
            finalPrice *= 0.95;
        }


        System.out.printf("%s %.2f lv.", typeOfSport, finalPrice);
    }
}
