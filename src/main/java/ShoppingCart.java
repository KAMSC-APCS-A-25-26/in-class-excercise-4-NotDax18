import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many items are you purchasing? ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer for number of items.");
            scanner.next();
            System.out.print("How many items are you purchasing? ");
        }
        int itemCount = scanner.nextInt();

        double total = 0.0;
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Price of item " + i + "? ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid price (decimal number).");
                scanner.next();
                System.out.print("Price of item " + i + "? ");
            }
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.printf("Your cart has %d item%s with a total cost of $%.2f%n",
                itemCount, itemCount == 1 ? "" : "s", total);
    }
}