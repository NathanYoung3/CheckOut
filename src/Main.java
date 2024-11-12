import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        boolean moreItems = false;

        do {
            total += InputHelper.getRangedDouble(scan, "Enter the item price: $", 0.5, 9.99);
            moreItems = InputHelper.getYNConfirm(scan, "Do you want to add another item? [Y/N]");
        } while (moreItems);

        System.out.printf("%-15s %10.2f" , "Total Cost in $: ", total);
    }
}