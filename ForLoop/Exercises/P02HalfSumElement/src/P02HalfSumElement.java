package forloop.exercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        sum -= maxNumber;

        int difference = Math.abs(sum - maxNumber);
        if (difference == 0) {
            System.out.println("Yes\n" +
                    "Sum = " + sum);
        } else {
            System.out.println("No\n" +
                    "Diff = " + difference);
        }
    }
}
