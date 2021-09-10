import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favoriteBook = scanner.nextLine();
        boolean isFound = false;
        int countBooks = 0;

        String book = scanner.nextLine();
        while (!book.equals("No More Books")) {
            if (book.equals(favoriteBook)) {
                isFound = true;
                break;
            }
            countBooks++;
            book = scanner.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
