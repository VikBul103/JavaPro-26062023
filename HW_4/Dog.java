package HW_4;

public class Dog extends Animal {
    private static int dogCount;

    public Dog() {
        super(500, 10);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
