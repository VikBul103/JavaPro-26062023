package HW_6;

public class Robot implements Participant {
    @Override
    public void run() {
        System.out.println("Robot is running.");
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping.");
    }
}
