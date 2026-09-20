package hackathon.track;

public class TicketonScoring implements Scoring {
    private static final int MAX_SCORE = 100;

    @Override
    public String getName() {
        return "Easy to Use";
    }

    @Override
    public int getMaxScore() {
        return MAX_SCORE;
    }
}
