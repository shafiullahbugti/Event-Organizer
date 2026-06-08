public class Seminar extends Event {
    private String speakerName;
    private String topic;

    public Seminar(String name, String date, String venue, String speakerName, String topic) {
        super(name, date, venue);
        this.speakerName = speakerName;
        this.topic = topic;
    }

    @Override
    public String getEventType() { return "Seminar"; }

    @Override
    public void displayInfo() {
        System.out.println("Type    : " + getEventType());
        System.out.println("Name    : " + getName());
        System.out.println("Date    : " + getDate());
        System.out.println("Venue   : " + getVenue());
        System.out.println("Speaker : " + speakerName);
        System.out.println("Topic   : " + topic);
    }
}
