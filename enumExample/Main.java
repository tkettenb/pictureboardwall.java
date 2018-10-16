package enumExample;

import static enumExample.TrafficLightPhase.PHASE_RED;
import static enumExample.TrafficLightPhase.PHASE_YELLOW;
import static enumExample.TrafficLightPhase.PHASE_GREEN;

public final class Main {
    public static void letsDoIt(final String arg) {
        switch(TrafficLightPhase.valueOf(arg)) {
            case PHASE_RED:
                System.out.println("Stop - it's red!");
                break;
            case PHASE_YELLOW:
                System.out.println("Go - but very fast :-). No seriously, it could be red/yellow - prepare to start. or yellow - you should stop.");
                break;
            case PHASE_GREEN:
                System.out.println("Go.");
                break;
            // NOTE: no default branch here !
        }
    }

    public static final void main(String...args) {
        for (String arg : args) {
            letsDoIt(arg);
        }
        letsDoIt(null);
        System.out.println("I guess, we passed the traffic light. Or are we still standing there?");
    }
}
