import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limitFails = Integer.parseInt(scanner.nextLine());
        int fails = 0;
        int tasks = 0;
        double sumMarks = 0;
        boolean isFailed = false;
        String lastTask = "";

        String input = scanner.nextLine();

        while (!input.equals("Enough")) {
            lastTask = input;
            tasks++;
            int mark = Integer.parseInt(scanner.nextLine());
            sumMarks += mark;
            if (mark <= 4) {
                fails++;
                if (fails >= limitFails) {
                    isFailed = true;
                    break;
                }
            }
            input = scanner.nextLine();
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", fails);
        } else {
            System.out.printf("Average score: %.2f%n", sumMarks/tasks);
            System.out.printf("Number of problems: %d%n", tasks);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
