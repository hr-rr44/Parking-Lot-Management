import java.util.ArrayList;

public class ParkingLot {
    private ArrayList<ParkingSpot> parkingSpots;

    public ParkingLot(int totalSpots) {
        parkingSpots = new ArrayList<>();

        // divide the parking spots into different categories based on the total number of spots
        int smallSpots = totalSpots / 3;
        int largeSpots = totalSpots / 3;
        int oversizedSpots = totalSpots - smallSpots - largeSpots;

        int spotNumber = 1;

        // create parking spots based on the calculated numbers for each type
        for (int i = 0; i < smallSpots; i++) {
            parkingSpots.add(new ParkingSpot(spotNumber++, TypeOfSpot.SMALL));
        }

        for (int i = 0; i < largeSpots; i++) {
            parkingSpots.add(new ParkingSpot(spotNumber++, TypeOfSpot.LARGE));
        }

        for (int i = 0; i < oversizedSpots; i++) {
            parkingSpots.add(new ParkingSpot(spotNumber++, TypeOfSpot.OVERSIZED));
        }
    }

    public ArrayList<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    // checks whether a vehicle can fit into a parking spot
    public boolean canFitVehicle(VehicleType vehicleT, ParkingSpot spot) {

        TypeOfSpot spotType = spot.getSpotType();

        if (vehicleT == VehicleType.COMPACT_CAR) {
            return true; // small vehicles can fit in any spot
        }

        if (vehicleT == VehicleType.FULL_SIZE_CAR) {
            return spotType == TypeOfSpot.LARGE || spotType == TypeOfSpot.OVERSIZED; // full-size cars can fit in large or oversized spots
        }

        return spotType == TypeOfSpot.OVERSIZED; // trucks can only fit in oversized spots
    }

    // prevents duplicate parking of the same vehicle
    public boolean isVehicleAlreadyParked(String plate) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isAvailable()) {
                if (spot.getParkedVehicle().getLicensePlate().equalsIgnoreCase(plate)) {
                    return true; // vehicle is already parked
                }
            }
        }
        return false; // vehicle is not parked
    }

    // parks a vehicle in the first available spot that can fit it
    public void parkVehicle(Vehicle vehicle) {
        if (isVehicleAlreadyParked(vehicle.getLicensePlate())) { 
            System.out.println("\nVehicle with license plate " + vehicle.getLicensePlate() + " is already parked.");
            return; // prevent duplicate parking
        }
        
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable() && canFitVehicle(vehicle.getType(), spot)) {
                spot.parkVehicle(vehicle);
                System.out.println("\n Vehicle with license plate " + vehicle.getLicensePlate() + " parked successfully.");
                System.out.println("Parked at spot number: " + spot.getSpotNumber() + " (" + spot.getSpotType() + ")");
                return;
            }
        }
        System.out.println( "\n no available parking spot for this vehicle." );
    }

    // removes a vehicle from the parking lot based on its license plate
    public void removeVehicle(String licensePlate) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isAvailable()){
                Vehicle vehicle = spot.getParkedVehicle();

                if (vehicle.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                    spot.removeVehicle();
                    System.out.println("\n Vehicle with license plate " + licensePlate + " removed from parking lot.");
                    return;
                }
            }
        }
    }

    // displays the current status of the parking lot, showing which spots are available and which are occupied
    public void displayParkingLotStatus() {
        System.out.println("\nParking Lot Status:");
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable()) {
                System.out.println("Spot " + spot.getSpotNumber() + " (" + spot.getSpotType() + "): Available");
            } else {
                System.out.println("Spot " + spot.getSpotNumber() + " (" + spot.getSpotType() + "): Occupied by " + spot.getParkedVehicle());
            }
        }
    }

    // 
    public void displayStats() {
        int occupiedSpots = 0;

        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isAvailable()) {
                occupiedSpots++;
            }
        }

        int totalSpots = parkingSpots.size();
        int availableSpots = totalSpots - occupiedSpots;


        System.out.println("\n Parking Lot Statistics:");
        System.out.println("Total Spots: " + totalSpots);
        System.out.println("Occupied Spots: " + occupiedSpots);
        System.out.println("Available Spots: " + availableSpots);

    }


    
}