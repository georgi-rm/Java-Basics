import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String bestPlayerName = "";
        int bestPlayerGoals = Integer.MIN_VALUE;

        while (!input.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > bestPlayerGoals) {
                bestPlayerGoals = goals;
                bestPlayerName = input;
                if (bestPlayerGoals >= 10) {
                    break;
                }
            }
            input = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayerName);
        if (bestPlayerGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", bestPlayerGoals);
        } else {
            System.out.printf("He has scored %d goals.%n", bestPlayerGoals);
        }
    }
}
