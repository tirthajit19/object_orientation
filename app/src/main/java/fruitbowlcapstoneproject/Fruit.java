package fruitbowlcapstoneproject;

public class Fruit {
    String name;
    String color;
    String type;
    String fruitSize;

    public Fruit(String name, String color, String type, String fruitSize) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.fruitSize = fruitSize;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", size='" + fruitSize + '\'' +
                '}';
    }
}
