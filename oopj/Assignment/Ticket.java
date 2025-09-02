/*
 * Problem 20: Ticket Booking System
Question:
Create a class Ticket with:
● passengerName (instance)
● ticketNo (instance, auto-generated using a static counter starting from 5001)
● Constructor to accept passengerName
● Method displayTicket() to show ticket details
Task:
Create 3 tickets and display their details.
Sample Input:
Passenger 1: Rahul
Passenger 2: Priya
Passenger 3: Amit
Sample Output:
Ticket No: 5001, Passenger: Rahul
Ticket No: 5002, Passenger: Priya
Ticket No: 5003, Passen
 */

package Java.oopj.Assignment;

public class Ticket {
    String passengerName;   // 
    int ticketNo;           
    static int counter = 5000; 
    // Constructor
    Ticket(String passengerName) {
        this.passengerName = passengerName;
        this.ticketNo = ++counter; 
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
    }

    public static void main(String[] args) {
        // Create 3 tickets
        Ticket t1 = new Ticket("Rahul");
        Ticket t2 = new Ticket("Priya");
        Ticket t3 = new Ticket("Amit");

        // Display details
        t1.displayTicket();
        t2.displayTicket();
        t3.displayTicket();
    }
}

