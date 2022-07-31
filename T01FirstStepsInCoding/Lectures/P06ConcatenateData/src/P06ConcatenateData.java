
import java.util.Scanner;

public class P06ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String first_name = scanner.nextLine();
        String last_name = scanner.nextLine();
        int age = Integer.parseInt( scanner.nextLine() );
        String town = scanner.nextLine();

        System.out.printf( "You are %s %s, a %d-years old person from %s.", first_name, last_name, age, town );
    }
}
