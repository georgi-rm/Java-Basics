
import java.util.Scanner;

public class P04InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scaner = new Scanner( System.in );
        double cm = Double.parseDouble( scaner.nextLine() );
        double inch = cm * 2.54;
        System.out.println( inch);
    }
}
