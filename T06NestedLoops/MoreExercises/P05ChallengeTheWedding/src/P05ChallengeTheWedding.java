import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfMaleClients = Integer.parseInt(scanner.nextLine());
        int countOfFemaleClients = Integer.parseInt(scanner.nextLine());
        int freeTables = Integer.parseInt(scanner.nextLine());

        for (int male = 1; male <= countOfMaleClients; male++) {
            for (int female = 1; female <= countOfFemaleClients; female++) {
                freeTables--;
                System.out.printf("(%d <-> %d) ", male, female);

                if (freeTables == 0) {
                    break;
                }
            }
            if (freeTables == 0) {
                break;
            }
        }
    }
}
