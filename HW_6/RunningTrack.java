package HW_6;

class RunningTrack implements Obstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        if (length > 0) {
            System.out.println("Participant passed the running track at the distance: " + length);
            return true;
        } else {
            System.out.println("Participant did not pass the running track at the distance: " + length);
            return false;
        }
    }
}
