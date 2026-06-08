public abstract class Event {
    private String name;
    private String date;
    private String venue;

    public Event(String name, String date, String venue) {
        this.name = name;
        this.date = date;
        this.venue = venue;
    }

    public String getName()  { return name; }
    public String getDate()  { return date; }
    public String getVenue() { return venue; }

    public abstract String getEventType();
    public abstract void displayInfo();
}
