import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int judges = Integer.parseInt(scanner.nextLine());
        double totalScore = 0;
        double totalMarks = 0;

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            double taskScore = 0;
            for (int i = 0; i < judges; i++) {
                taskScore += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("%s - %.2f.%n", input, taskScore / judges);
            totalScore += taskScore;
            totalMarks += judges;
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalScore / totalMarks);
    }
}
