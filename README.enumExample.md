#### Do we need a default case in a switch/case (when called with a enum from string ...)

(it's probably language dependent and/or if you have exceptions enabled or not ...)

eg. see: https://stackoverflow.com/questions/4649423/should-switch-statements-always-contain-a-default-clause


#### compile

    ✗ javac enumExample/TrafficLightPhase.java
    ✗ javac enumExample/Main.java           


#### examples

     ✗ java enumExample.Main
     in thread "main" java.lang.NullPointerException: Name is null
        at java.lang.Enum.valueOf(Enum.java:236)
        at enumExample.TrafficLightPhase.valueOf(TrafficLightPhase.java:3)
        at enumExample.Main.letsDoIt(Main.java:9)
        at enumExample.Main.main(Main.java:27)

    ✗ java enumExample.Main foo
    Exception in thread "main" java.lang.IllegalArgumentException: No enum constant enumExample.TrafficLightPhase.red
        at java.lang.Enum.valueOf(Enum.java:238)
        at enumExample.TrafficLightPhase.valueOf(TrafficLightPhase.java:3)
        at enumExample.Main.letsDoIt(Main.java:9)
        at enumExample.Main.main(Main.java:25)

    ✗ java enumExample.Main PHASE_RED PHASE_GREEN PHASE_YELLOW UNKNOWN
    Stop - it's red!
    Go.
    Go - but very fast :-). No seriously, it could be red/yellow - prepare to start. or yellow - you should stop.
    Exception in thread "main" java.lang.IllegalArgumentException: No enum constant enumExample.TrafficLightPhase.UNKNOWN
        at java.lang.Enum.valueOf(Enum.java:238)
        at enumExample.TrafficLightPhase.valueOf(TrafficLightPhase.java:3)
        at enumExample.Main.letsDoIt(Main.java:9)
        at enumExample.Main.main(Main.java:25)


