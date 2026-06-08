public class Participant {
    private String name;
    private String rollNo;
    private String eventName;

    public Participant(String name, String rollNo, String eventName) {
        this.name = name;
        this.rollNo = rollNo;
        this.eventName = eventName;
    }

    public String getName()   { return name; }
    public String getRollNo() { return rollNo; }

    public void register() {
        System.out.println(name + " (" + rollNo + ") registered for: " + eventName);
    }

    public void getDetails() {
        System.out.println("Participant: " + name + " | Roll No: " + rollNo + " | Event: " + eventName);
    }
}
