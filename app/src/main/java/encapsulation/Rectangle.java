package encapsulation;

public class Rectangle {
    private int length, breadth;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public static void main(String[] args) {
        Rectangle object = new Rectangle(15, 10);
        System.out.println("Length " + object.getLength());
        System.out.println("Breadth " + object.getBreadth());

        object.setBreadth(5);
        object.setLength(10);

        System.out.println("Length " + object.getLength());
        System.out.println("Breadth " + object.getBreadth());
    }
}
