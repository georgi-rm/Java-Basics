import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if ( i % 2 == 0) {
                leftSum += number;
            } else {
                rightSum += number;
            }
        }

        if (leftSum == rightSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + leftSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(leftSum - rightSum));
        }
    }
}
