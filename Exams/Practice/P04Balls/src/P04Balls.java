import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfBalls = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int pointsFromRed = 0;
        int pointsFromOrange = 0;
        int pointsFromYellow = 0;
        int pointsFromWhite = 0;
        int dividersFromBlack = 0;
        int countOtherBalls = 0;

        for (int i = 0; i < countOfBalls; i++) {
            String ballColour = scanner.nextLine();

            switch (ballColour) {
                case "red":
                    pointsFromRed++;
                    totalPoints += 5;
                    break;
                case "orange":
                    pointsFromOrange++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    pointsFromYellow++;
                    totalPoints += 15;
                    break;
                case "white":
                    pointsFromWhite++;
                    totalPoints += 20;
                    break;
                case "black":
                    dividersFromBlack++;
                    totalPoints /= 2;
                    break;
                default:
                    countOtherBalls++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Points from red balls: %d%n", pointsFromRed);
        System.out.printf("Points from orange balls: %d%n", pointsFromOrange);
        System.out.printf("Points from yellow balls: %d%n", pointsFromYellow);
        System.out.printf("Points from white balls: %d%n", pointsFromWhite);
        System.out.printf("Other colors picked: %d%n", countOtherBalls);
        System.out.printf("Divides from black balls: %d%n", dividersFromBlack);
    }
}
