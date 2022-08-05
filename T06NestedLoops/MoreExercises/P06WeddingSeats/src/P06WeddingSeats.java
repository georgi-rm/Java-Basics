import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSectorLetter = scanner.nextLine().charAt(0);
        int countOfRowsInFirstSector = Integer.parseInt(scanner.nextLine());
        int countOfSeatsOnOddRow = Integer.parseInt(scanner.nextLine());

        int countOfRowsOnCurrentSector = countOfRowsInFirstSector;
        int countOfAllSeats = 0;

        for (char sectorLetter = 'A'; sectorLetter <= lastSectorLetter; sectorLetter++) {
            for (int row = 1; row <= countOfRowsOnCurrentSector; row++) {
                int countOfSeatsOnCurrentRow = countOfSeatsOnOddRow;

                if (row % 2 == 0) {
                    countOfSeatsOnCurrentRow += 2;
                }

                for (int seat = 0; seat < countOfSeatsOnCurrentRow; seat++) {
                    countOfAllSeats++;
                    System.out.printf("%c%d%c%n", sectorLetter, row, 'a' + seat);
                }
            }
            countOfRowsOnCurrentSector++;
        }

        System.out.println(countOfAllSeats);
    }
}
