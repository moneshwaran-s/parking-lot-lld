# parking-lot-lld
Beginner-friendly Parking Lot Low Level Design using Java

🔹 Problem Statement
Design a simple Parking Lot system using Object-Oriented Programming principles.

🔹 Assumptions
--> Single parking lot
--> Fixed number of slots
--> One vehicle per slot
--> No payment system
--> Supports Car and Bike

🔹 Core Classes
Vehicle
      -vehicleNumber  
      -vehicleType
      
ParkingSlot
      -slotNumber
      -isOccupied
      -vehicle

ParkingLot
      -manages parking slots
      -parks and removes vehicles

🔹 Class Relationships
=> ParkingLot has multiple ParkingSlots
=> ParkingSlot holds one Vehicle

🔹 Functionalities
=> Park a vehicle
=> Remove a vehicle
=> Show available slots
=> Show parked vehicles

🔹 Edge Cases Handled
=> Parking lot full
=> Removing from empty slot
=> Invalid slot number

🔹 Time Complexity
=> Parking vehicle: O(N)
=> Remove vehicle: O(1)

🔹 Technologies
=> Java
=> OOP Principles
