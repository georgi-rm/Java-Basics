import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfDays = Integer.parseInt(scanner.nextLine());

        int countOfMedics = 7;
        int countOfTreatedPatients = 0;
        int countOfUntreatedPatients = 0;

        for (int i = 1; i <= countOfDays; i++) {
            int countOfPatients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && countOfUntreatedPatients > countOfTreatedPatients) {
                countOfMedics++;
            }

            if (countOfPatients <= countOfMedics) {
                countOfTreatedPatients += countOfPatients;
            } else {
                countOfTreatedPatients += countOfMedics;
                countOfUntreatedPatients += countOfPatients - countOfMedics;
            }
        }

        System.out.printf("Treated patients: %d.%n", countOfTreatedPatients);
        System.out.printf("Untreated patients: %d.", countOfUntreatedPatients);
    }
}