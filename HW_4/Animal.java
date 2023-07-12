package HW_4;

public class Animal {
    protected int runLimit;
    protected int swimLimit;
    protected static int count;

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public void run(int length) {
        if (length <= runLimit) {
            System.out.println(getClass().getSimpleName() + " ran " + length + " m");
        } else {
            System.out.println(getClass().getSimpleName() + " can't run that far");
        }
    }

    public void swim(int length) {
        if (swimLimit == 0) {
            System.out.println(getClass().getSimpleName() + " can't swim");
        } else if (length <= swimLimit) {
            System.out.println(getClass().getSimpleName() + " swam " + length + " m");
        } else {
            System.out.println(getClass().getSimpleName() + " can't swim that far");
        }
    }

    public static int getCount() {
        return count;
    }
}
