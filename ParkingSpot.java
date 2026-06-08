public class ParkingSpot {
    private int spotNumber;
    private TypeOfSpot type;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber, TypeOfSpot type) {
        this.spotNumber = spotNumber;
        this.type = type;
        this.parkedVehicle = null;
    }

    // spot is available if there is no vehicle parked in it
    public boolean isAvailable() {
        return parkedVehicle == null;
    }

    public void parkVehicle(Vehicle vehicle) {
        parkedVehicle = vehicle;
    }

    public void removeVehicle() {
        parkedVehicle = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public TypeOfSpot getSpotType() {
        return type;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }


}