public class Workshop extends Event {
    private String trainerName;
    private int maxSeats;

    public Workshop(String name, String date, String venue, String trainerName, int maxSeats) {
        super(name, date, venue);
        this.trainerName = trainerName;
        this.maxSeats = maxSeats;
    }

    @Override
    public String getEventType() { return "Workshop"; }

    @Override
    public void displayInfo() {
        System.out.println("Type    : " + getEventType());
        System.out.println("Name    : " + getName());
        System.out.println("Date    : " + getDate());
        System.out.println("Venue   : " + getVenue());
        System.out.println("Trainer : " + trainerName);
        System.out.println("Seats   : " + maxSeats);
    }
}
