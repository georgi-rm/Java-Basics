package forloop.exercise;

import java.util.Scanner;

public class P06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTabs = Integer.parseInt(scanner.nextLine());
        double salaryMax = Double.parseDouble(scanner.nextLine());
        double salary = salaryMax;

        for (int i = 0; i < numberOfTabs; i++) {
            String input = scanner.nextLine();
            switch (input) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                break;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);
        }
    }
}
