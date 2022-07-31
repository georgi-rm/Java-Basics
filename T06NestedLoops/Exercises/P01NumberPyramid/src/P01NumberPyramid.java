import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numbersOnLine = 0;
        int maxNumbersOnLine = 1;

        for (int i = 1; i <= n; i++) {
            numbersOnLine++;
            System.out.printf("%d ", i);
            if (numbersOnLine >= maxNumbersOnLine) {
                numbersOnLine = 0;
                maxNumbersOnLine++;
                System.out.printf("%n");
            }
        }
    }
}
