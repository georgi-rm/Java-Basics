import java.util.Scanner;

public class P07SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int passwordsLeftToGenerate = Integer.parseInt(scanner.nextLine());

        char firstSymbol = 35;
        char secondSymbol = 64;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {

                System.out.printf("%c%c%d%d%c%c|", firstSymbol, secondSymbol, x, y, secondSymbol, firstSymbol);
                passwordsLeftToGenerate--;
                if (passwordsLeftToGenerate == 0) {
                    break;
                }

                firstSymbol++;
                if (firstSymbol > 55) {
                    firstSymbol = 35;
                }
                secondSymbol++;
                if (secondSymbol > 96) {
                    secondSymbol = 64;
                }
            }
            if (passwordsLeftToGenerate == 0) {
                break;
            }
        }
    }
}
