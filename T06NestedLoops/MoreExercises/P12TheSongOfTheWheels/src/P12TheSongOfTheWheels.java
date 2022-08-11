import java.util.Scanner;

public class P12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlValue = Integer.parseInt(scanner.nextLine());

        String passwordOutput = "No!";
        int countOfPasswords = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = a + 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d < c; d++) {
                        if (a * b + c * d == controlValue) {

                            System.out.printf("%d%d%d%d ", a, b, c, d);

                            countOfPasswords++;
                            if (countOfPasswords == 4) {
                                passwordOutput = "Password: " + a + b + c + d;
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println(passwordOutput);
    }
}
