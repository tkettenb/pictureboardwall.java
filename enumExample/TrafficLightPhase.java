package enumExample;

public enum TrafficLightPhase {

    PHASE_RED("red"),
    PHASE_YELLOW("yellow"),
    PHASE_GREEN("green");

    private String phase;

    TrafficLightPhase(String phase) {
        this.phase = phase;
    }
}

