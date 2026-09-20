package hackathon.track;

public class TicketonTask implements Task {
    @Override
    public String getTitle() {
        return "Event Finder App";
    }

    @Override
    public String describe() {
        return "Make an app that helps people find and buy tickets for events";
    }
}
