package domain;

public class Task {

    String description;

    public enum Status {
        IN_PROGRESS,
        DONE,
        PAUSED
    }
}
