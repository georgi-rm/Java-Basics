import java.util.Scanner;

public class P09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalVolumeOfSpace = width * length * height;

        while (totalVolumeOfSpace > 0) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            totalVolumeOfSpace -= Integer.parseInt(input);
        }

        if (totalVolumeOfSpace > 0) {
            System.out.printf("%d Cubic meters left.", totalVolumeOfSpace);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalVolumeOfSpace));
        }
    }
}
