package encapsulation;

public class Boy {
    private int age;

    public Boy(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > this.age)
            this.age = age;
    }

    public static void main(String[] args) {
        Boy object = new Boy(5);
        System.out.println("Age of Boy: "+ object.getAge());
        object.setAge(10);
        System.out.println("Age of Boy: "+ object.getAge());
        object.setAge(8);
        System.out.println("Age of Boy: "+ object.getAge());
    }
}
