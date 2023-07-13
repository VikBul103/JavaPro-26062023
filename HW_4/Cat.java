package HW_4;

class Cat extends Animal {
    private static int catCount;

    public Cat() {
        super(200, 0);
        catCount++;
    }

    public void run(int length) {
        if (length <= runLimit) {
            System.out.println(getClass().getSimpleName() + " ran " + length + " m");
        } else {
            System.out.println(getClass().getSimpleName() + " can't run that far");
        }
    }

    public void swim(int length) {
        System.out.println(getClass().getSimpleName() + " can't swim");
    }

    public static int getCatCount() {
        return catCount;
    }
}
