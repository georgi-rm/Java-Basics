package conditionalstatements.exercise;

import java.util.Scanner;

public class P04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();

        double meters = input;
        double output = 0;

        if (inputUnit.equals("mm")) {
            meters = input / 1000;
        } else if (inputUnit.equals("cm")) {
            meters = input / 100;
        } else {
            meters = input;
        }

        if (outputUnit.equals("mm")) {
            output = meters * 1000;
        } else if (outputUnit.equals("cm")) {
            output = meters * 100;
        } else {
            output = meters;
        }
        System.out.printf("%.3f", output);

    }
}
