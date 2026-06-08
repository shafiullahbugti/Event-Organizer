public class Volunteer {
    private String name;
    private String role;
    private String eventName;

    public Volunteer(String name, String role, String eventName) {
        this.name = name;
        this.role = role;
        this.eventName = eventName;
    }

    public String getName()  { return name; }
    public String getRole()  { return role; }
    public void setRole(String role) { this.role = role; }

    public void getDetails() {
        System.out.println("Volunteer : " + name + " | Role: " + role + " | Event: " + eventName);
    }
}
