package capstoneproject;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<Item> items = new ArrayList<>();

    public void addItem(String name, int quantity, double price){
            items.add(new Item(name, quantity, price));
    }
    public double getTotal(){
        double total_price = 0.0;
        for (Item item : items) {
            total_price += item.quantity * item.price;
        }
        return total_price;
    }
}









//    public void removeItem(String name){
//        for (int i = 0; i < items.size(); i++) {
//            if(items.get(i).name == name){
//                items.remove(i);
//            }
//        }
//    }