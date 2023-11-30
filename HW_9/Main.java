package HW_9;


public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        orangeBox.addFruit(orange1);

        System.out.println("Apple Box Weight: " + appleBox.getWeight());
        System.out.println("Orange Box Weight: " + orangeBox.getWeight());

        System.out.println("Are the boxes equal? " + appleBox.compare(orangeBox));

        orangeBox1.merge(orangeBox);

        System.out.println("Apple Box Weight after merging: " + appleBox.getWeight());
        System.out.println("Orange Box Weight after merging: " + orangeBox.getWeight());
    }
}
