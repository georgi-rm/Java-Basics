import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());

        double average = 0;

        int countOfStudentsTop = 0;
        int countOfStudentsBetween4And5 = 0;
        int countOfStudentsBetween3And4 = 0;
        int countOfStudentsFail = 0;

        for (int i = 0; i < countOfStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            average += grade;

            if (grade < 3) {
                countOfStudentsFail++;
            } else if (grade < 4) {
                countOfStudentsBetween3And4++;
            } else if (grade < 5) {
                countOfStudentsBetween4And5++;
            } else {
                countOfStudentsTop++;
            }
        }

        average /= countOfStudents;
        double percentageOfStudentsTop = 100.0 * countOfStudentsTop / countOfStudents;
        double percentageOfStudentsBetween4And5 = 100.0 * countOfStudentsBetween4And5 / countOfStudents;
        double percentageOfStudentsBetween3And4 = 100.0 * countOfStudentsBetween3And4 / countOfStudents;
        double percentageOfStudentsFail = 100.0 * countOfStudentsFail / countOfStudents;

        System.out.printf("Top students: %.2f%%\n", percentageOfStudentsTop);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", percentageOfStudentsBetween4And5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", percentageOfStudentsBetween3And4);
        System.out.printf("Fail: %.2f%%\n", percentageOfStudentsFail);
        System.out.printf("Average: %.2f", average);
    }
}
