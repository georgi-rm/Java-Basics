import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        boolean isFoundC = false;
        boolean isFoundO = false;
        boolean isFoundN = false;

        StringBuilder word = new StringBuilder();
        StringBuilder print = new StringBuilder();

        while (!command.equals("End")) {
            boolean canAddLetter = true;

            if ((command.charAt(0) >= 'a' && command.charAt(0) <= 'z')
                    || (command.charAt(0) >= 'A' && command.charAt(0) <= 'Z')) {

                switch (command) {
                    case "c":
                        if (!isFoundC) {
                            isFoundC = true;
                            canAddLetter = false;
                        }
                        break;
                    case "o":
                        if (!isFoundO) {
                            isFoundO = true;
                            canAddLetter = false;
                        }
                        break;
                    case "n":
                        if (!isFoundN) {
                            isFoundN = true;
                            canAddLetter = false;
                        }
                        break;
                }

                if (isFoundC && isFoundO && isFoundN) {
                    isFoundC = false;
                    isFoundO = false;
                    isFoundN = false;
                    print.append(word);
                    word.setLength(0);
                    print.append(" ");
                }

                if (canAddLetter) {
                    word.append(command);
                }
            }

            command = scanner.nextLine();
        }

        System.out.print(print);
    }
}
