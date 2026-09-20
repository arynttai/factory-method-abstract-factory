package hackathon.track;

public class ArbuzScoring implements Scoring {
    private static final int MAX_SCORE = 100;

    @Override
    public String getName() {
        return "Delivery Speed";
    }

    @Override
    public int getMaxScore() {
        return MAX_SCORE;
    }
}
