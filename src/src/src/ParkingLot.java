class ParkingLot {
    ParkingSlot[] slots;

    ParkingLot(int totalSlots) {
        slots = new ParkingSlot[totalSlots];
        for (int i = 0; i < totalSlots; i++) {
            slots[i] = new ParkingSlot(i + 1);
        }
    }

    void parkVehicle(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied) {
                slot.parkVehicle(vehicle);
                System.out.println("Vehicle parked at slot " + slot.slotNumber);
                return;
            }
        }
        System.out.println("Parking Lot is Full");
    }

    void removeVehicle(int slotNumber) {
        ParkingSlot slot = slots[slotNumber - 1];
        if (slot.isOccupied) {
            slot.removeVehicle();
            System.out.println("Slot freed");
        } else {
            System.out.println("Slot already empty");
        }
    }
}

