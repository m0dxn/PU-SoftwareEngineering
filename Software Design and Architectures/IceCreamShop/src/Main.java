package src;

import src.IceCreams.IceCream;
import src.Shop.SingletonShop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* SingletonShop shop = SingletonShop.getInstance();

        IceCream iceCream1 = shop.makeIceCream("vanilla","glaze");
        System.out.println(iceCream1.getDescription() + " Cost: "+iceCream1.getCost());

        IceCream iceCream2 = shop.makeIceCream("chocolate","sprinkles");
        System.out.println(iceCream2.getDescription() + " Cost: "+iceCream2.getCost());*/

        Scanner scanner = new Scanner(System.in);
        SingletonShop shop = SingletonShop.getInstance();

        System.out.println("Welcome to IceCream src.Shop!");
        System.out.println("Please choose one of the following options: Vanilla / Chocolate / Strawberry");
        String flavor = scanner.nextLine().toLowerCase();

        System.out.println("Would you like an addon? (glaze / sprinkles / none)");
        String topping = scanner.nextLine().toLowerCase();

        if (topping.equals("none")) {
            topping = "";
        }

        IceCream order = shop.makeIceCream(flavor, topping);

        if (order != null) {
            System.out.println("\nYour order: " + order.getDescription());
            System.out.printf("Price: %.2f lv.\n", order.getCost());
        } else {
            System.out.println("\nInvalid order!.");
        }

        scanner.close();
    }
}
