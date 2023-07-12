package HW_4;

public class Cat extends Animal {
    private static int catCount;

    public Cat() {
        super(200, 0);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }
}
