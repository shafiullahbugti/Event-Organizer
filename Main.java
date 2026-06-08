import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Event> events = new ArrayList<>();
    static ArrayList<Volunteer> volunteers = new ArrayList<>();
    static ArrayList<Participant> participants = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Campus Event Organizer =====");
            System.out.println("1. Add Event");
            System.out.println("2. Add Volunteer");
            System.out.println("3. Register Participant");
            System.out.println("4. Display All Events");
            System.out.println("5. Show Event Details");
            System.out.println("6. Search Event by Name");
            System.out.println("7. Cancel Event");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addEvent(); break;
                case 2: addVolunteer(); break;
                case 3: registerParticipant(); break;
                case 4: displayAllEvents(); break;
                case 5: showEventDetails(); break;
                case 6: searchEvent(); break;
                case 7: cancelEvent(); break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    static void addEvent() {
        System.out.print("Event type (1=Workshop, 2=Seminar): ");
        int type = sc.nextInt(); sc.nextLine();

        System.out.print("Name: ");  String name  = sc.nextLine();
        System.out.print("Date: ");  String date  = sc.nextLine();
        System.out.print("Venue: "); String venue = sc.nextLine();

        if (type == 1) {
            System.out.print("Trainer Name: "); String trainer = sc.nextLine();
            System.out.print("Max Seats: ");    int seats = sc.nextInt(); sc.nextLine();
            events.add(new Workshop(name, date, venue, trainer, seats));
        } else {
            System.out.print("Speaker Name: "); String speaker = sc.nextLine();
            System.out.print("Topic: ");        String topic   = sc.nextLine();
            events.add(new Seminar(name, date, venue, speaker, topic));
        }
        System.out.println("Event added successfully!");
    }

    static void addVolunteer() {
        System.out.print("Volunteer Name: "); String name = sc.nextLine();
        System.out.print("Role: ");           String role = sc.nextLine();
        System.out.print("Event Name: ");     String eventName = sc.nextLine();
        volunteers.add(new Volunteer(name, role, eventName));
        System.out.println("Volunteer added!");
    }

    static void registerParticipant() {
        System.out.print("Student Name: ");  String name   = sc.nextLine();
        System.out.print("Roll Number: ");   String rollNo = sc.nextLine();
        System.out.print("Event Name: ");    String eventName = sc.nextLine();
        Participant p = new Participant(name, rollNo, eventName);
        participants.add(p);
        p.register();
    }

    static void displayAllEvents() {
        if (events.isEmpty()) {
            System.out.println("No events found.");
            return;
        }
        System.out.println("\n--- All Events ---");
        for (int i = 0; i < events.size(); i++) {
            System.out.println((i + 1) + ". " + events.get(i).getName() +
                               " [" + events.get(i).getEventType() + "] - " + events.get(i).getDate());
        }
    }

    static void showEventDetails() {
        System.out.print("Enter event name: ");
        String name = sc.nextLine();
        for (Event e : events) {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println("\n--- Event Details ---");
                e.displayInfo();

                System.out.println("-- Volunteers --");
                for (Volunteer v : volunteers)
                    v.getDetails();

                System.out.println("-- Participants --");
                int count = 0;
                for (Participant p : participants) {
                    p.getDetails();
                    count++;
                }
                System.out.println("Total Participants: " + count);
                return;
            }
        }
        System.out.println("Event not found.");
    }

    static void searchEvent() {
        System.out.print("Enter event name to search: ");
        String name = sc.nextLine();
        for (Event e : events) {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + e.getName() + " [" + e.getEventType() + "] on " + e.getDate());
                return;
            }
        }
        System.out.println("Event not found.");
    }

    static void cancelEvent() {
        System.out.print("Enter event name to cancel: ");
        String name = sc.nextLine();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getName().equalsIgnoreCase(name)) {
                events.remove(i);
                System.out.println("Event cancelled.");
                return;
            }
        }
        System.out.println("Event not found.");
    }
}
