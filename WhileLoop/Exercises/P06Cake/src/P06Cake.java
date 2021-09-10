import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());

        int totalPieces = cakeWidth * cakeLength;
        int piecesTaken = 0;
        boolean isCakeEaten = false;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            piecesTaken += Integer.parseInt(input);
            if (piecesTaken >= totalPieces) {
                isCakeEaten = true;
                break;
            }
            input = scanner.nextLine();
        }
        int piecesDifference = Math.abs(totalPieces - piecesTaken);
        if (isCakeEaten) {
            System.out.printf("No more cake left! You need %d pieces more.", piecesDifference);
        } else {
            System.out.printf("%d pieces are left.", piecesDifference);
        }
    }
}
