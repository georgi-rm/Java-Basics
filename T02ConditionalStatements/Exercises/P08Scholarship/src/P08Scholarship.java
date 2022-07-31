package conditionalstatements.exercise;

import java.util.Scanner;

public class P08Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double avrgGrade = Double.parseDouble(scanner.nextLine());
        double minWorkSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0;
        double excellentScholarship = 0;

        if (income < minWorkSalary) {
            if (avrgGrade > 4.5) {
                socialScholarship = Math.floor(minWorkSalary * 0.35);
            }
        }

        if (avrgGrade >= 5.5) {
            excellentScholarship = Math.floor(avrgGrade * 25);
        }

        if (socialScholarship + excellentScholarship == 0) {
            System.out.printf("You cannot get a scholarship!");
        } else if (socialScholarship > excellentScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        }
    }
}
