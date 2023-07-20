package HW_6;

public class Human implements Participant {
    @Override
    public void run() {
        System.out.println("Human is running.");
    }

    @Override
    public void jump() {
        System.out.println("Human is jumping.");
    }
}
