package capstoneproject;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<Item> items = new ArrayList<>();

    public void addItem(String name, int quantity, double price){
            items.add(new Item(name, quantity, price));
    }

    public void addItem(Item item){
            items.add(item);
    }

    public void updateItem(Item item, int quanity){
         // Find item
         // Update quantity
            items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void removeItemByQuantity(Item item, int quantity) {
        Optional<Item> itemOptional = items
        .stream
        .filter(itm -> itm.getName().equals(item.getName))
        .findFirst(); // -> Optional 
        
        if(itemOptional.isPresent()) {
            itemOptional.get().setQuanity(quantity);
        } else {
            // log 
        }

        

        addItem(item);
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