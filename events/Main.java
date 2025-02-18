package events;

public class Main {
    public static void main(String[] args) {
        // Create event manager
        EventManager manager = new EventManager("John Doe");

        // Create an event
        Event concert = manager.createEvent("Rock Concert", 1000);
        concert.displayEventInfo();

        // Display statistics
        System.out.println("Total events: " + EventStatistics.getTotalEvents());

        // Use event handler
        manager.createEventHandler("MUSIC");

        // Start an event
        manager.startEvent("New Year Party");
    }
}
