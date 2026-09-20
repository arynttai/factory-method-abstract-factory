package hackathon.track;

public class ArbuzTrackFactory implements TrackFactory {
    @Override
    public Task createTask() {
        return new ArbuzTask();
    }

    @Override
    public Scoring createScoring() {
        return new ArbuzScoring();
    }
}
