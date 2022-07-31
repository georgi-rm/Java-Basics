import java.util.Scanner;

public class P08GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int level = 1;
        boolean isWarned = false;
        boolean isExcluded = false;
        double scoreSum = 0;

        while ( level <= 12) {
            double score = Double.parseDouble(scanner.nextLine());
            if (score < 4.00) {
                if (isWarned) {
                    isExcluded = true;
                    break;
                }
                isWarned = true;
                continue;
            }
            scoreSum += score;
            level++;
        }
        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, level);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, scoreSum / ( level - 1));
        }
    }
}
