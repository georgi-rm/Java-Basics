import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int countOfAllFans = Integer.parseInt(scanner.nextLine());

        int countOfFansInSectorA = 0;
        int countOfFansInSectorB = 0;
        int countOfFansInSectorV = 0;
        int countOfFansInSectorG = 0;

        for (int i = 0; i < countOfAllFans; i++) {
            String sectorLabel = scanner.nextLine();

            if (sectorLabel.equals("A")) {
                countOfFansInSectorA++;
            } else if (sectorLabel.equals("B")) {
                countOfFansInSectorB++;
            } else if (sectorLabel.equals("V")) {
                countOfFansInSectorV++;
            } else if (sectorLabel.equals("G")) {
                countOfFansInSectorG++;
            }
        }

        double percentageOfFansInSectorA = 100.0 * countOfFansInSectorA / countOfAllFans;
        double percentageOfFansInSectorB = 100.0 * countOfFansInSectorB / countOfAllFans;
        double percentageOfFansInSectorV = 100.0 * countOfFansInSectorV / countOfAllFans;
        double percentageOfFansInSectorG = 100.0 * countOfFansInSectorG / countOfAllFans;
        double percentageOfAllFans = 100.0 * countOfAllFans / stadiumCapacity;

        System.out.printf("%.2f%%\n", percentageOfFansInSectorA);
        System.out.printf("%.2f%%\n", percentageOfFansInSectorB);
        System.out.printf("%.2f%%\n", percentageOfFansInSectorV);
        System.out.printf("%.2f%%\n", percentageOfFansInSectorG);
        System.out.printf("%.2f%%", percentageOfAllFans);

    }
}
