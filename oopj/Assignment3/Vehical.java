/*
 * 8. Vehicle Types
Scenario: You want to categorize vehicles.
Problem Statement:
Create a superclass Vehicle with brand, speed. Create subclasses Car and Bike with additional modelType.
Display details of each vehicle.
Classes/Fields:
● Vehicle → brand, speed
● Car → modelType
● Bike → modelType
Sample Input:
Car → brand=Honda, speed=180, modelType=Civic
Bike → brand=Yamaha, speed=120, modelType=R15
Sample Output:
Car → Honda Civic, Speed=180
Bike → Yamaha R15, Speed=120
 */


package Java.oopj.Assignment3;

public class Vehical {
    String brand;
    double speed;
    
}
class car extends Vehical{
    String modelType;

    car(String brand,double speed,String modelType)
    {
        this.brand=brand;
        this.speed=speed;
        this.modelType=modelType;
        System.out.println("Car -> "+brand+" "+modelType+", Speed="+speed);
    }


}

class Bike extends Vehical{
    String modelType;

    Bike(String brand,double speed,String modelType)
    {
        this.brand=brand;
        this.speed=speed;
        this.modelType=modelType;
        System.out.println("Bike -> "+brand+" "+modelType+", Speed="+speed);
    }

}

class MainVehical
{
    public static void main(String[] args) {
        car c=new car("Honda", 180, "civic");
        Bike b = new Bike("Yamaha", 120, "R15");
    }
}