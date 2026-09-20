package hackathon;

import hackathon.track.ArbuzTrackFactory;
import hackathon.track.Scoring;
import hackathon.track.Task;
import hackathon.track.TicketonTrackFactory;
import hackathon.track.TrackFactory;

public class Main {

    public static void main(String[] args) {
        printTrack(new ArbuzTrackFactory());
        printTrack(new TicketonTrackFactory());
    }

    private static void printTrack(TrackFactory factory) {
        Task task = factory.createTask();
        Scoring scoring = factory.createScoring();

        System.out.println(task.getTitle());
        System.out.println(task.describe());
        System.out.println(scoring.getName() + " (max " + scoring.getMaxScore() + ")");
    }
}
