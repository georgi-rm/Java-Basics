import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeSpaceWidth = Integer.parseInt(scanner.nextLine());
        int freeSpaceLength = Integer.parseInt(scanner.nextLine());
        int freeSpaceHeight = Integer.parseInt(scanner.nextLine());

        int volumeOfFreeSpace = freeSpaceWidth * freeSpaceLength * freeSpaceHeight;
        int totalBoxes = 0;
        boolean isFull = false;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            totalBoxes += Integer.parseInt(command);
            if (totalBoxes >= volumeOfFreeSpace) {
                isFull = true;
                break;
            }
            command = scanner.nextLine();
        }
        int piecesDifference = Math.abs(volumeOfFreeSpace - totalBoxes);
        if (isFull) {
            System.out.printf("No more free space! You need %d Cubic meters more.", piecesDifference);
        } else {
            System.out.printf("%d Cubic meters left.", piecesDifference);
        }
    }
}
