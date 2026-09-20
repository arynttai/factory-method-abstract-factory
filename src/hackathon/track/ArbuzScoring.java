package hackathon.track;

public class ArbuzScoring implements Scoring {
    @Override
    public String getName() {
        return "Delivery Speed";
    }

    @Override
    public int getMaxScore() {
        return 50;
    }
}
