package events;

public class EventStatistics {
    private static int totalEvents = 0;

    static void incrementEventCount() { // Now restricted to package scope
        totalEvents++;
    }

    public static int getTotalEvents() {
        return totalEvents;
    }
}

