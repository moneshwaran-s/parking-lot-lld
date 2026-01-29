class ParkingSlot {
    int slotNumber;
    boolean isOccupied;
    Vehicle vehicle;

    ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
    }

    void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }
}
