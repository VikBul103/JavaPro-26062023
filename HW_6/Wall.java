package HW_6;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        if (height > 0) {
            System.out.println("Participant passed the wall with a height of: " + height);
            return true;
        } else {
            System.out.println("Participant did not pass the wall with a height of: " + height);
            return false;
        }
    }
}
