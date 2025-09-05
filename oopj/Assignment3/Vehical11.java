/*
 * 17. Vehicle Speed Display
Scenario: Vehicle management system needs to display speed differently for different vehicle types.

Problem Statement:
Create class Vehicle with method displaySpeed(). Subclass Car and Bike override it.

Classes/Fields:
● Vehicle → displaySpeed() prints “Vehicle speed unknown”
● Car → overrides displaySpeed() → “Car speed 120 km/h”
● Bike → overrides displaySpeed() → “Bike speed 80 km/h”

Sample Input:
Car
Bike

Sample Output:
Car speed 120 km/h
Bike speed 80 km/h
 */

package Java.oopj.Assignment3;

public class Vehical11 {

    void displaySpeed()

    {
        System.out.println("Vehicle speed unknown");
    }
}

class Car1 extends Vehical11{
    int speed;
    String vehicaltype;


    Car1(String vehicaltype,int speed)
    {
        this.vehicaltype=vehicaltype;
        this.speed=speed;
        this.speed=120;
    }

   
    void displaySpeed()

    {
        System.out.println(vehicaltype+" speed "+speed+" km/h");
    }

}

class Bike1 extends Vehical11{


    int speed;
    String vehicaltype;


    Bike1(String vehicaltype,int speed)
    {
        this.vehicaltype=vehicaltype;
        this.speed=speed;
        this.speed=80;
    }

    void displaySpeed()

    {
        System.out.println(vehicaltype+" speed "+speed+" km/h");
    }


}
class VEHICALMAIN
{
    public static void main(String[] args) {
        Vehical11 v=new Car1("Car", 0);
        Vehical11 v1=new Bike1("Bike", 0);

        v.displaySpeed();;
        v1.displaySpeed();
    }
}
