import java.util.Scanner;

public class P06SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int validCombination = 0;
        boolean isFound = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c < 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int sumDigits = a + b + c + d;
                        int multiplyDigits = a * b * c * d;
                        if ((n % 10 == 5) && (sumDigits == multiplyDigits)) {
                            validCombination = a * 1000 + b * 100 + c * 10 + d;
                            isFound = true;
                            break;
                        }
                        if ((n % 3 == 0) && (multiplyDigits / sumDigits == 3)) {
                            validCombination = d * 1000 + c * 100 + b * 10 + a;
                            isFound = true;
                            break;
                        }
                    }
                    if (isFound) {
                        break;
                    }
                }
                if (isFound) {
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (isFound) {
            System.out.println(validCombination);
        } else {
            System.out.println("Nothing found");
        }
    }
}
