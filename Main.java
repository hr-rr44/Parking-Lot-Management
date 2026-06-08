import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of parking spots: ");

        int totalSpots = scanner.nextInt();
        scanner.nextLine();

        ParkingLot parkingLot = new ParkingLot(totalSpots);

        int choice;
        do {
            System.out.println("\nParking Lot Management System");
            System.out.println("1. Park a Vehicle");
            System.out.println("2. Remove a Vehicle");
            System.out.println("3. Display Parking Lot Status");
            System.out.println("4. Display Statistics");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("enter your vehicle license plate: ");
                    String licensePlate = scanner.nextLine();
                    System.out.print("enter vehicle type (COMPACT_CAR, FULL_SIZE_CAR, TRUCK): ");
                    String vehicleChoice = scanner.nextLine();

                    VehicleType vehicleType = VehicleType.valueOf(vehicleChoice.toUpperCase());
                    Vehicle vehicle = new Vehicle(licensePlate, vehicleType);
                    parkingLot.parkVehicle(vehicle);
                    break;
                case 2:
                    System.out.print("Enter the license plate of the vehicle to remove: ");
                    String plateToRemove = scanner.nextLine();
                    parkingLot.removeVehicle(plateToRemove);
                    break;
                case 3:
                    parkingLot.displayParkingLotStatus();
                    break;
                case 4:
                    parkingLot.displayStats();
                    break;
                case 5:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Not a valid choice.");

            }
        } while (choice != 5);
        scanner.close();


        
    }
}