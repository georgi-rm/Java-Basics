import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfMonths = Integer.parseInt(scanner.nextLine());

        final double BILL_FOR_WATTER_EACH_MONTH = 20.0;
        final double BILL_FOR_INTERNET_EACH_MONTH = 15.0;

        double billForElectricity = 0;
        double billForWater = BILL_FOR_WATTER_EACH_MONTH * countOfMonths;
        double billForInternet = BILL_FOR_INTERNET_EACH_MONTH * countOfMonths;
        double billForOther = 0;


        for (int i = 0; i < countOfMonths; i++) {
            double currentBillForElectricity = Double.parseDouble(scanner.nextLine());

            billForElectricity += currentBillForElectricity;
            billForOther += (currentBillForElectricity + BILL_FOR_WATTER_EACH_MONTH + BILL_FOR_INTERNET_EACH_MONTH) * 1.2;
        }

        double averageBills = (billForElectricity + billForWater + billForInternet + billForOther) / countOfMonths;

        System.out.printf("Electricity: %.2f lv\n", billForElectricity);
        System.out.printf("Water: %.2f lv\n", billForWater);
        System.out.printf("Internet: %.2f lv\n", billForInternet);
        System.out.printf("Other: %.2f lv\n", billForOther);
        System.out.printf("Average: %.2f lv", averageBills);
    }
}
