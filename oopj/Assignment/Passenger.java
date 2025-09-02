/*
 * Problem 6: Indian Railway Ticket Booking
Scenario:
You are building a mini ticket booking system. A passenger can book a ticket either by giving name and
age or name, age, and seat type. The system should also count the total tickets booked using a static
counter.
Tasks:
1. Create a Passenger class.
2. Implement two constructors (constructor overloading):
Constructor 1 → Passenger(String name, int age)
Constructor 2 → Passenger(String name, int age, String seatType)
3. Use a static counter to keep track of total passengers booked.
4. Print passenger details and total passengers.
Input Example:
Passenger1: "Ravi", 25
Passenger2: "Anita", 30, "AC Sleeper"
Passenger3: "Suresh", 40
Expected Output:
Passenger1: Name: Ravi, Age: 25, Seat: General
Passenger2: Name: Anita, Age: 30, Seat: AC Sleeper
Passenger3: Name: Suresh, Age: 40, Seat: General
Total Passengers Booked: 3
 */



package Java.oopj.Assignment;

public class Passenger {
      String name;
        int age;
        String seatType;
       static int totalbooked;

       

    Passenger(String name,int age)
    {
        this.name=name;
        this.age=age;
        this.seatType = "General";
        totalbooked++;
       
    }

    Passenger(String name,int age,String seatType)
    {
        this.name=name;
        this.age=age;
        this.seatType=seatType;
         totalbooked++;
     

    }

    static void counter()
    {
        System.out.println("Total Passengers Booked: "+totalbooked);
    }
    

    public static void main(String[] args) {

        Passenger p=new Passenger("Ravi", 25);
        Passenger p1=new Passenger("Anita", 30, "AC Sleeper");
        Passenger p2=new Passenger("Suresh", 40);


        System.out.println("Name: "+p.name+" Age: "+p.age+ " Seat: "+p.seatType);
        System.out.println("Name: "+p1.name+" Age: "+p1.age+ " Seat: "+p1.seatType);
        System.out.println("Name: "+p2.name+" Age: "+p2.age+ " Seat: "+p2.seatType);
        



        Passenger.counter();
    }
    
}
