package HW_4;

class Dog extends Animal {
    private static int dogCount;

    public Dog() {
        super(500, 10);
        dogCount++;
    }

    public void run(int length) {
        if (length <= runLimit) {
            System.out.println(getClass().getSimpleName() + " ran " + length + " m");
        } else {
            System.out.println(getClass().getSimpleName() + " can't run that far");
        }
    }

    public void swim(int length) {
        if (length <= swimLimit) {
            System.out.println(getClass().getSimpleName() + " swam " + length + " m");
        } else {
            System.out.println(getClass().getSimpleName() + " can't swim that far");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
