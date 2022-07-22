package capstoneproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CartMainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //Creating object of ShoppingCart class to perform cart operations
        ShoppingCart cartOperation = new ShoppingCart();

        System.out.println("Enter the number of different items");
        int n = Integer.parseInt(input.readLine());

        //Using loop to enter the details of individual items
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the item name, quantity and price");

            String item_name = input.readLine();
            int quantity = Integer.parseInt(input.readLine());
            double price = Double.parseDouble(input.readLine());
            //Passing the values to the list of objects.
            cartOperation.addItem(item_name, quantity, price);
        }

        //Checking for offers on total price and total litres of milk.
        StoreOffers offerCheck = new StoreOffers();
        double total_cost = offerCheck.checkDiscount(cartOperation.getTotal());

        System.out.println("Enter the total litres of milk bought");
        int litres = Integer.parseInt(input.readLine());
        int total_litres_of_milk = offerCheck.milkOffer(litres);

        //Displaying the cost and litres of milk to Customer.
        System.out.println("The total price is = "+total_cost);
        System.out.println("The total litres of milk is = "+total_litres_of_milk);
        System.out.println("Thank you for Shopping");
    }
}










//        System.out.println("If you want to remove an item from cart then enter the name of the item");
//        String removeItemName = input.next();
//        cartOperation.removeItem(removeItemName);