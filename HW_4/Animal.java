package HW_4;

abstract class Animal {
    protected int runLimit;
    protected int swimLimit;
    protected static int count;

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public abstract void run(int length);

    public abstract void swim(int length);

    public static int getCount() {
        return count;
    }
}
