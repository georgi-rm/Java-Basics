package firststeps.moreexercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double liceSteni = x * x * 2 - (1.2 * 2) + y * x * 2 - (2 * 1.5 * 1.5);
        double licePokriv = 2 * x * y + x * h;

        double greenPaint = liceSteni / 3.4;
        double redPaint = licePokriv / 4.3;

        System.out.printf("%.2f\n%.2f", greenPaint, redPaint);
    }
}
