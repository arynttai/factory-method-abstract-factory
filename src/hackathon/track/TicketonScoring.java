package hackathon.track;

public class TicketonScoring implements Scoring {
    @Override
    public String getName() {
        return "Easy to Use";
    }

    @Override
    public int getMaxScore() {
        return 50;
    }
}
