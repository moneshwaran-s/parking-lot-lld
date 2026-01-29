🚗 Parking Lot – Low Level Design (Java)

Overview:
This project demonstrates a simple and beginner-friendly Low Level Design (LLD) of a Parking Lot system using Object-Oriented Programming (OOP) concepts in Java.

The goal of this project is learning and interview preparation, especially for LLD rounds (Zoho-style).

---

🎯 Problem Statement
Design a Parking Lot system that can:
- Park vehicles
- Remove vehicles
- Track available parking slots
- Display parked vehicles

Each parking slot can hold only one vehicle at a time.

---

Assumptions:
To keep the design simple and focused on fundamentals:

- Single parking lot
- Fixed number of parking slots
- One vehicle per slot
- Supports Car and Bike
- No payment system
- No multiple floors
- No time-based logic

---

🧩 Core Classes

1️⃣ Vehicle
Represents a vehicle entering the parking lot.

Attributes:
- vehicleNumber
- vehicleType

---

2️⃣ ParkingSlot
Represents a single parking slot.

Attributes:
- slotNumber
- isOccupied
- vehicle

Responsibilities:
- Park a vehicle
- Remove a vehicle
- Track slot availability

---

3️⃣ ParkingLot
Manages all parking slots.

Responsibilities:
- Initialize parking slots
- Find nearest available slot
- Park vehicles
- Remove vehicles
- Display slot information

---

🔗 Class Relationships
- ParkingLot has multiple ParkingSlots (1 → many)
- ParkingSlot holds one Vehicle (0 or 1)

This ensures clear separation of responsibilities following OOP principles.

---

⚙️ Functionalities Implemented
- Park a vehicle in the nearest available slot
- Remove a vehicle using slot number
- Handle parking lot full scenario
- Handle removal from empty slot
- Display available and occupied slots

---

🚦 Edge Cases Handled
- Parking lot is full
- Removing a vehicle from an empty slot
- Invalid slot number access

---

⏱️ Time Complexity
- Park vehicle: O(N)
- Remove vehicle: O(1)

---

🛠️ Technologies Used
- Java
- Object-Oriented Programming (OOP)

---

🎓 Learning Outcome
This project helped me understand:
- How to identify classes from requirements
- How to assign responsibilities correctly
- How to design before coding
- How to explain LLD clearly in interviews

---

Note:
This project is intentionally kept simple and beginner-focused.
It is designed for LLD interview preparation, not for production use.

Future enhancements (not implemented):
- Multiple floors
- Pricing system
- Different vehicle sizes

---

📁 Project Structure
src/
 ├── Vehicle.java
 ├── ParkingSlot.java
 └── ParkingLot.java
---

⭐ If you are preparing for LLD interviews, feel free to explore or fork this repository.

