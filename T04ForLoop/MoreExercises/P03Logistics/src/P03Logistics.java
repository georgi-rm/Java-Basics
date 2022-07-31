import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPackages = Integer.parseInt(scanner.nextLine());

        int weightOfPackagesByBus = 0;
        int weightOfPackagesByTruck = 0;
        int weightOfPackagesByTrain = 0;

        for (int i = 0; i < numberOfPackages; i++) {
            int weightOfPackage = Integer.parseInt(scanner.nextLine());

            if (weightOfPackage < 4) {
                weightOfPackagesByBus += weightOfPackage;
            } else if (weightOfPackage < 12) {
                weightOfPackagesByTruck += weightOfPackage;
            } else {
                weightOfPackagesByTrain += weightOfPackage;
            }
        }

        int totalWeight = weightOfPackagesByBus + weightOfPackagesByTruck + weightOfPackagesByTrain;
        double averagePrice = 1.0 * ((weightOfPackagesByBus * 200) + (weightOfPackagesByTruck * 175) + (weightOfPackagesByTrain * 120)) / totalWeight;
        double percentageByBus = 100.0 * weightOfPackagesByBus / totalWeight;
        double percentageByTruck = 100.0 * weightOfPackagesByTruck / totalWeight;
        double percentageByTrain = 100.0 * weightOfPackagesByTrain / totalWeight;

        System.out.printf("%.2f\n", averagePrice);
        System.out.printf("%.2f%%\n", percentageByBus);
        System.out.printf("%.2f%%\n", percentageByTruck);
        System.out.printf("%.2f%%\n", percentageByTrain);
    }
}
