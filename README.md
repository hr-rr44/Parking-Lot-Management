Hrithika Ravishankar

Overview: 
This is a Parking Lot Management Application, developed in Java, using the command line. The user enters the total number of parking spots, and the system will divide them into three categories: Small spots, Large spots, and Oversized spots. The application allows users to park vehicles, remove vehicles, view the current parking lot status, and view parking lot statistics.

Compiling/Running
1. open a terminal, then navigate to the project folder
2. compile all java files using:
    javac *.java
3. run the program using:
    java Main
4. enter the total number of parking spots when prompted to do so
5. use the menu options to: 
    - park a vehicle
    - remove a vehicle
    - display parking lot status
    - display parking statistics
    - exit the program

Test Cases/Sample Outputs:
Enter the total number of parking spots: 5

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 1
enter your vehicle license plate: aug-654
enter vehicle type (COMPACT_CAR, FULL_SIZE_CAR, TRUCK): COMPACT_CAR

 Vehicle with license plate aug-654 parked successfully.
Parked at spot number: 1 (SMALL)

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 1
enter your vehicle license plate: 987-ytf
enter vehicle type (COMPACT_CAR, FULL_SIZE_CAR, TRUCK): FULL_SIZE_CAR

 Vehicle with license plate 987-ytf parked successfully.
Parked at spot number: 2 (LARGE)

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 1
enter your vehicle license plate: lkj-765
enter vehicle type (COMPACT_CAR, FULL_SIZE_CAR, TRUCK): TRUCK

 Vehicle with license plate lkj-765 parked successfully.
Parked at spot number: 3 (OVERSIZED)

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 1
enter your vehicle license plate: lkj-765
enter vehicle type (COMPACT_CAR, FULL_SIZE_CAR, TRUCK): TRUCK

Vehicle with license plate lkj-765 is already parked.

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 1
enter your vehicle license plate: 876-hgf
enter vehicle type (COMPACT_CAR, FULL_SIZE_CAR, TRUCK): FULL_SIZE_CAR

 Vehicle with license plate 876-hgf parked successfully.
Parked at spot number: 4 (OVERSIZED)

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 1
enter your vehicle license plate: 987-jes
enter vehicle type (COMPACT_CAR, FULL_SIZE_CAR, TRUCK): COMPACT_CAR

 Vehicle with license plate 987-jes parked successfully.
Parked at spot number: 5 (OVERSIZED)

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 1
enter your vehicle license plate: kjh-765
enter vehicle type (COMPACT_CAR, FULL_SIZE_CAR, TRUCK): TRUCK

 no available parking spot for this vehicle.

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 2
Enter the license plate of the vehicle to remove: 987-jes

 Vehicle with license plate 987-jes removed from parking lot.

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 3

Parking Lot Status:
Spot 1 (SMALL): Occupied by aug-654 (COMPACT_CAR)
Spot 2 (LARGE): Occupied by 987-ytf (FULL_SIZE_CAR)
Spot 3 (OVERSIZED): Occupied by lkj-765 (TRUCK)
Spot 4 (OVERSIZED): Occupied by 876-hgf (FULL_SIZE_CAR)
Spot 5 (OVERSIZED): Available

Parking Lot Management System
1. Park a Vehicle
2. Remove a Vehicle
3. Display Parking Lot Status
4. Display Statistics
5. Exit
Enter your choice: 4
 Parking Lot Statistics:
Total Spots: 5
Occupied Spots: 4
Available Spots: 1