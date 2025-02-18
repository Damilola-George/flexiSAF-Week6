package events;

public class EventManager {
    private String managerName;

    public EventManager(String name) {
        this.managerName = name;
    }

    public Event createEvent(String eventName, int capacity) {
        return new Event(eventName, capacity, this.managerName);
    }

    // Nested static class for handling events
    public static class EventHandler {
        private String type;

        public EventHandler(String type) {
            this.type = type;
        }

        public void handleEvent() {
            System.out.println("Handling " + type + " event");
        }
    }

    public void createEventHandler(String eventType) {
        EventHandler handler = new EventHandler(eventType);
        handler.handleEvent();
    }

    public void startEvent(String eventName) {
        EventListener listener = new EventListener() {
            @Override
            public void onEventStart() {
                System.out.println(eventName + " has started!");
            }

            @Override
            public void onEventEnd() {
                System.out.println(eventName + " has ended!");
            }
        };

        listener.onEventStart();
        System.out.println("Event in progress...");
        listener.onEventEnd();
    }
}
