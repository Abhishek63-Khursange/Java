/*
 * Problem 19: Vehicle Registration – Static Block
Scenario:
Add a static block to Vehicle class:
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads
● Verify that the message prints only once when multiple vehicles are created
 */

package Java.oopj.Assignment;

public class Vehicle2 {
    String regNo;
    String ownerName;
    String vehicleType;

    static int vehicleCount = 0; // shared counter

   
    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

  
    Vehicle2(String ownerName, String vehicleType) {
        vehicleCount++;  // increment for each new vehicle
        this.regNo = "MH-2025-" + vehicleCount; // auto-generate registration no.
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
        Vehicle2 v1 = new Vehicle2("Abhishek Khursange", "2-Wheeler");
        Vehicle2 v2 = new Vehicle2("Rajendra Khursange", "4-Wheeler");

        System.out.println("RegNo: " + v1.getRegNo() + ", Owner: " + v1.getOwnerName() + ", Type: " + v1.getVehicleType());
        System.out.println("RegNo: " + v2.getRegNo() + ", Owner: " + v2.getOwnerName() + ", Type: " + v2.getVehicleType());

        Vehicle2.displayTotalVehicles();
    }
}
