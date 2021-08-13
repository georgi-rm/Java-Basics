package firststeps.exercise;

import java.util.Scanner;

public class P05BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int roomRent = Integer.parseInt( scanner.nextLine() );

        double torta = 0.2 * roomRent;
        double drinks = torta - 0.45 * torta;
        double animator = roomRent / 3.0;

        double total = roomRent + torta + drinks + animator;
        System.out.println( total );
    }
}
