package events;

public class Event {
    private String eventName;
    private int capacity;
    private String managerName;

    public Event(String eventName, int capacity, String managerName) {
        this.eventName = eventName;
        this.capacity = capacity;
        this.managerName = managerName;
        EventStatistics.incrementEventCount();
    }

    public void displayEventInfo() {
        System.out.println("Event: " + eventName);
        System.out.println("Managed by: " + managerName);
        System.out.println("Capacity: " + capacity);
    }

    public String getEventName() {
        return eventName;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getManagerName() {
        return managerName;
    }
}
