import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalFloors = Integer.parseInt(scanner.nextLine());
        int totalRooms = Integer.parseInt(scanner.nextLine());
        char letter = ' ';

        for (int i = totalFloors; i > 0; i--) {
            for (int j = 0; j < totalRooms; j++) {
                if (i == totalFloors) {
                    letter = 'L';
                } else if (i % 2 == 0) {
                    letter = 'O';
                } else {
                    letter = 'A';
                }
                System.out.printf("%c%d%d ", letter, i, j);
            }
            System.out.printf("%n");
        }
    }
}
