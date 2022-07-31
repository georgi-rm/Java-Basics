import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        double m2 = Double.parseDouble( scanner.nextLine() );

        double suma = m2 * 7.61;
        double discount = suma * 18 / 100;
        double total = suma - discount;

        System.out.printf( "The final price is: %.2f lv.\n", total );
        System.out.printf( "The discount is: %.2f lv.", discount );
    }
}
