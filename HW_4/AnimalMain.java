package HW_4;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run(150);
        dog.swim(8);

        Cat cat = new Cat();
        cat.run(250);
        cat.swim(5);

        System.out.println("Count of dogs: " + Dog.getDogCount());
        System.out.println("Count of cats: " + Cat.getCatCount());
        System.out.println("Count of animals: " + Animal.getCount());
    }
}
