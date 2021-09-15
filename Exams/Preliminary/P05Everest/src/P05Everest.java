import java.util.Scanner;

public class P05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isClimbedEverest = false;
        int days = 1;
        int climbedMeters = 5364;

        while (!input.equals("END")) {
            if (input.equals("Yes")) {
                days++;
                if (days > 5) {
                    break;
                }
            }

            climbedMeters += Integer.parseInt(scanner.nextLine());

            if (climbedMeters >= 8848) {
                isClimbedEverest = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (isClimbedEverest) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.println("Failed!");
            System.out.println(climbedMeters);
        }
    }
}
