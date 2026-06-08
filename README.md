# Event-Organizer
# 🎓 Campus Event Organizer

A console-based Java application for managing campus events, volunteers, and participant registrations. Built using Object-Oriented Programming principles including **inheritance**, **abstraction**, and **polymorphism**.

---

## 📋 Table of Contents

- [About the Project](#about-the-project)
- [Features](#features)
- [Project Structure](#project-structure)
- [Class Diagram](#class-diagram)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [OOP Concepts Used](#oop-concepts-used)
- [Author](#author)

---

## About the Project

The **Campus Event Organizer** is a Java console application that allows users to create and manage two types of campus events — **Workshops** and **Seminars** — along with their associated volunteers and participants. All data is stored in-memory using `ArrayList` during the program session.

This project was built as part of the **COMP-112: Object-Oriented Programming** course (2nd Semester, BSAI Program).

---

## Features

- ✅ Add a **Workshop** (with trainer name and seat limit) or **Seminar** (with speaker name and topic)
- ✅ Add **Volunteers** and assign them roles and events
- ✅ Register **Participants** by name and roll number
- ✅ Display a list of all events
- ✅ View full details of a specific event, including its volunteers and participants
- ✅ Search for an event by name
- ✅ Cancel (remove) an event

---

## Project Structure

```
CampusEventOrganizer/
│
├── Main.java          # Entry point; contains the menu and all user interaction logic
├── Event.java         # Abstract base class for all event types
├── Workshop.java      # Subclass of Event; adds trainer name and seat limit
├── Seminar.java       # Subclass of Event; adds speaker name and topic
├── Volunteer.java     # Represents a volunteer assigned to an event
└── Participant.java   # Represents a student registered for an event
```

---

## Class Diagram

```
         ┌─────────────────┐
         │   Event (Abstract)│
         │─────────────────│
         │ - name          │
         │ - date          │
         │ - venue         │
         │─────────────────│
         │ + getName()     │
         │ + getDate()     │
         │ + getVenue()    │
         │ + getEventType()│  ← abstract
         │ + displayInfo() │  ← abstract
         └────────┬────────┘
                  │
        ┌─────────┴──────────┐
        │                    │
┌───────▼──────┐    ┌────────▼──────┐
│   Workshop   │    │    Seminar    │
│──────────────│    │───────────────│
│ - trainerName│    │ - speakerName │
│ - maxSeats   │    │ - topic       │
└──────────────┘    └───────────────┘

┌──────────────────┐    ┌──────────────────┐
│    Volunteer     │    │   Participant    │
│──────────────────│    │──────────────────│
│ - name           │    │ - name           │
│ - role           │    │ - rollNo         │
│ - eventName      │    │ - eventName      │
│ + getDetails()   │    │ + register()     │
└──────────────────┘    │ + getDetails()   │
                        └──────────────────┘
```

---

## Getting Started

### Prerequisites

- Java JDK 8 or higher installed
- A terminal / command prompt

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

---

## Usage

When the program runs, you will see the main menu:

```
===== Campus Event Organizer =====
1. Add Event
2. Add Volunteer
3. Register Participant
4. Display All Events
5. Show Event Details
6. Search Event by Name
7. Cancel Event
0. Exit
Enter choice:
```

**Example — Adding a Workshop:**
```
Event type (1=Workshop, 2=Seminar): 1
Name: Java Basics Workshop
Date: 2025-10-15
Venue: Lab Block A
Trainer Name: Dr. Ali
Max Seats: 30
Event added successfully!
```

**Example — Registering a Participant:**
```
Student Name: Ahmed Khan
Roll Number: B25F0120AI177
Event Name: Java Basics Workshop
Ahmed Khan (B25F0120AI177) registered for: Java Basics Workshop
```

---

## OOP Concepts Used

| Concept | Where Applied |
|---|---|
| **Abstraction** | `Event` is an abstract class with abstract methods `getEventType()` and `displayInfo()` |
| **Inheritance** | `Workshop` and `Seminar` both extend `Event` |
| **Polymorphism** | `ArrayList<Event>` stores both `Workshop` and `Seminar` objects; `displayInfo()` behaves differently for each |
| **Encapsulation** | All class fields are `private` with public getter methods |

---

## Author

**Shafiullah**
