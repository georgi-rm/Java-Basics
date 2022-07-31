
import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt( scanner.nextLine() );
        int otherAnimals = Integer.parseInt( scanner.nextLine() );

        double suma = ( 2.50 * dogs ) + ( otherAnimals * 4 );

        System.out.printf( "%.1f lv.", suma );
    }
}
