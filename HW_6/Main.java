package HW_6;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = {new Human(), new Cat(), new Robot()};

        Obstacle[] obstacles = {new RunningTrack(100), new Wall(3), new RunningTrack(50), new Wall(2)};

        for (Participant participant : participants) {
            boolean isParticipantActive = true;
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    isParticipantActive = false;
                    break;
                }
            }
            if (isParticipantActive) {
                System.out.println("Participant completed the course!");
            } else {
                System.out.println("Participant was eliminated from the course.");
            }
            System.out.println("-----------------------");
        }
    }
}
