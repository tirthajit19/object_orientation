package fruitbowlcapstoneproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FruitBasket {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<Fruit> fruits = new ArrayList<>();

        System.out.println("Enter the number of fruits");
        int n = Integer.parseInt(input.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name, color, type and size of fruit");
            String name = input.readLine();
            String color = input.readLine();
            String type = input.readLine();
            String fruitSize = input.readLine();
            fruits.add(new Fruit(name, color, type, fruitSize));
        }

        FruitBasket object = new FruitBasket();
        object.sortBySize((ArrayList<Fruit>) fruits);
    }

    private void sortBySize(ArrayList<Fruit> fruits) {
        ArrayList<Fruit> firstLayer = new ArrayList<>();
        ArrayList<Fruit> secondLayer = new ArrayList<>();
        ArrayList<Fruit> thirdLayer = new ArrayList<>();

        for (int i = 0; i < fruits.size(); i++) {
            if(fruits.get(i).fruitSize.equalsIgnoreCase("Small"))
                firstLayer.add(fruits.get(i));
            else if (fruits.get(i).fruitSize.equalsIgnoreCase("Medium")) {
                secondLayer.add(fruits.get(i));
            }
            else
                thirdLayer.add(fruits.get(i));
        }

        System.out.println("The fruits are arranged in the basket as followed");
        System.out.println(firstLayer);
        System.out.println(secondLayer);
        System.out.println(thirdLayer);
    }
}
