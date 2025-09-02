/*
 * Problem 7: Indian Movie Ticket Booking
Scenario:
A cinema hall offers Normal and Premium tickets. A customer can book just name or name with
ticket type. Keep track of total tickets sold using a static counter.
Tasks:
1. Create a Customer class.
2. Implement two constructors:
Constructor 1 → Customer(String name)
Constructor 2 → Customer(String name, String ticketType)
3. Static counter to track tickets sold.
4. Print customer details and total tickets sold.
Input Example:
Customer1: "Rahul"
Customer2: "Pooja", "Premium"
Customer3: "Amit"
Expected Output:
Customer1: Name: Rahul, Ticket: Normal
Customer2: Name: Pooja, Ticket: Premium
Customer3: Name: Amit, Ticket: Normal
Total Tickets Sold: 3

 */

package Java.oopj.Assignment;

public class Customer {

    String name;
    String ticketType;
    static int totalTicket;

    // Constructor 1 → Name only → default ticket type is Normal
    Customer(String name) {
        this.name = name;
        this.ticketType = "Normal";
        totalTicket++;
    }

    // Constructor 2 → Name and ticket type
    Customer(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
        totalTicket++;
    }

    // Getter methods
    String getName() {
        return name;
    }

    String getTicketType() {
        return ticketType;
    }

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    // Static method to display total tickets sold
    static void counter() {
        System.out.println("Total Tickets Sold: " + totalTicket);
    }

    public static void main(String[] args) {
        Customer c = new Customer("Rahul");
        Customer c1 = new Customer("Pooja", "Premium");
        Customer c2 = new Customer("Amit");

        System.out.println("Customer1: Name: " + c.getName() + ", Ticket: " + c.getTicketType());
        System.out.println("Customer2: Name: " + c1.getName() + ", Ticket: " + c1.getTicketType());
        System.out.println("Customer3: Name: " + c2.getName() + ", Ticket: " + c2.getTicketType());

        Customer.counter();
    }
}
