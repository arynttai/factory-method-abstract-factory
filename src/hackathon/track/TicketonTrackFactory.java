package hackathon.track;

public class TicketonTrackFactory implements TrackFactory {
    @Override
    public Task createTask() {
        return new TicketonTask();
    }

    @Override
    public Scoring createScoring() {
        return new TicketonScoring();
    }
}
