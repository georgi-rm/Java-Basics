package conditionalstatements.moreexercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volumeLiters = Integer.parseInt(scanner.nextLine());
        int pipeOne = Integer.parseInt(scanner.nextLine());
        int pipeTwo = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double liters = ( pipeOne + pipeTwo ) * hours;

        if (liters > volumeLiters){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, liters - volumeLiters);
        } else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", liters / volumeLiters * 100, pipeOne * hours / liters * 100, pipeTwo * hours / liters * 100 );
        }
    }
}
