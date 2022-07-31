import java.util.Scanner;

public class P04Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        while (counter <= number) {
            System.out.println(counter);
            counter = counter * 2 + 1;
        }
    }
}
