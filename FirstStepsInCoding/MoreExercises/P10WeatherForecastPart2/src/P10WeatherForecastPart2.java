package firststeps.moreexercises;

import java.util.Scanner;

public class P10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degree = Double.parseDouble(scanner.nextLine());

        if (degree < 5.0) {
            System.out.println("unknown");
        } else if (degree < 12.0) {
            System.out.println("Cold");
        } else if (degree < 15.0) {
            System.out.println("Cool");
        } else if (degree < 20.1){
            System.out.println("Mild");
        } else if (degree < 26.0){
            System.out.println("Warm");
        } else if (degree <= 35.0){
            System.out.println("Hot");
        } else{
            System.out.println("unknown");
        }
    }
}
