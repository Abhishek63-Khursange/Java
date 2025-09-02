/*
 * Problem 18: Vehicle Registration – Static Counter
Scenario:
Create Vehicle class with regNo, ownerName, vehicleType.
● Static variable: vehicleCount
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount
● Getter methods for all fields
● Create 2 vehicles, display registration details

 */

package Java.oopj.Assignment;

public class Vehicle {
    String regNo;
    String ownerName;
    String vehicleType;

    static int vehicleCount = 0; 

 
    Vehicle(String ownerName, String vehicleType) {
        vehicleCount++;  
        this.regNo = "MH-2025-" + vehicleCount; 
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Getters
    String getRegNo() {
        return regNo;
    }
    String getOwnerName() {
        return ownerName;
    }
    String getVehicleType() {
        return vehicleType;
    }

    static void displayTotalVehicles() {
        System.out.println("Total registered vehicles: " + vehicleCount);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Abhishek Khursange", "2-Wheeler");
        Vehicle v2 = new Vehicle("Rajendra Khursange", "4-Wheeler");

        System.out.println("RegNo: " + v1.getRegNo() + ", Owner: " + v1.getOwnerName() + ", Type: " + v1.getVehicleType());
        System.out.println("RegNo: " + v2.getRegNo() + ", Owner: " + v2.getOwnerName() + ", Type: " + v2.getVehicleType());

        Vehicle.displayTotalVehicles();
    }
}
