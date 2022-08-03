import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());

        for (int n1 = beginOfInterval; n1 <= endOfInterval; n1++) {
            for (int n2 = beginOfInterval; n2 <= endOfInterval; n2++) {
                for (int n3 = beginOfInterval; n3 <= endOfInterval; n3++) {
                    if ((n2 + n3) % 2 != 0) {
                        continue;
                    }

                    for (int n4 = beginOfInterval; n4 <= endOfInterval; n4++) {
                        if (((n1 % 2 == 0 && n4 % 2 != 0) || (n1 % 2 != 0 && n4 % 2 == 0)) && n1 > n4) {
                            System.out.printf("%d%d%d%d ", n1, n2, n3, n4);
                        }
                    }
                }
            }
        }
    }
}
