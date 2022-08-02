import java.util.Scanner;

public class P03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int x1 = 1; x1 <= 9; x1++) {
            for (int x2 = 1; x2 <= 9; x2++) {
                for (int x3 = 1; x3 <= 9; x3++) {
                    for (int x4 = 1; x4 <= 9; x4++) {
                        if ((x1 + x2 == x3 + x4) && (n % (x1 + x2) == 0)) {
                            System.out.printf("%d%d%d%d ", x1, x2, x3, x4);
                        }
                    }
                }
            }
        }
    }
}
