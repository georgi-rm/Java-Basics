package forloop.exercise;

import java.util.Scanner;

public class P04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1++;
            } else if (number < 400) {
                p2++;
            } else if (number < 600) {
                p3++;
            } else if (number < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        int totalNumbers = p1 + p2 + p3 + p4 + p5;
        System.out.printf("%.2f%%\n", 100.0 * p1 / totalNumbers);
        System.out.printf("%.2f%%\n", 100.0 * p2 / totalNumbers);
        System.out.printf("%.2f%%\n", 100.0 * p3 / totalNumbers);
        System.out.printf("%.2f%%\n", 100.0 * p4 / totalNumbers);
        System.out.printf("%.2f%%\n", 100.0 * p5 / totalNumbers);
    }
}
