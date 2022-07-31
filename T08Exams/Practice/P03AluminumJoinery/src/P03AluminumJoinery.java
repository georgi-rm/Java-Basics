import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJoinery = Integer.parseInt(scanner.nextLine());
        String typeOfJoinery = scanner.nextLine();
        String deliveryType = scanner.nextLine();

        double totalPrice = 0;

        switch (typeOfJoinery) {
            case "90X130":
                totalPrice = 110 * countJoinery;
                if (countJoinery > 60) {
                    totalPrice *= 0.92;
                } else if (countJoinery > 30) {
                    totalPrice *= 0.95;
                }
                break;
            case "100X150":
                totalPrice = 140 * countJoinery;
                if (countJoinery > 80) {
                    totalPrice *= 0.90;
                } else if (countJoinery > 40) {
                    totalPrice *= 0.94;
                }
                break;
            case "130X180":
                totalPrice = 190 * countJoinery;
                if (countJoinery > 50) {
                    totalPrice *= 0.88;
                } else if (countJoinery > 20) {
                    totalPrice *= 0.93;
                }
                break;
            case "200X300":
                totalPrice = 250 * countJoinery;
                if (countJoinery > 50) {
                    totalPrice *= 0.86;
                } else if (countJoinery > 25) {
                    totalPrice *= 0.91;
                }
                break;
        }

        if (deliveryType.equals("With delivery")) {
            totalPrice += 60;
        }
        if (countJoinery > 99) {
            totalPrice *= 0.96;
        }

        if (countJoinery < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", totalPrice);
        }
    }
}
