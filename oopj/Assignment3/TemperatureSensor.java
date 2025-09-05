/* 5. Temperature Sensor
Scenario: Sensor should only accept temperatures in safe range.
Problem Statement:
Create a class TemperatureSensor with private temperature. Setter validates range 0–100°C.
Fields:
● private int temperature
Methods:
● setTemperature(int t) → only 0–100 valid
● getTemperature() → return temperature
Sample Input:
temperature = -5
Sample Output:
“Temperature out of range”
 */


package Java.oopj.Assignment3;

public class TemperatureSensor {
    private double temperature;
 

    //setter

    
    
    void setTemperature(double temperature)
    {
        if(temperature>0 && temperature<=100)
        {
          this.temperature=temperature;

        }
        else
        {
            System.out.println("Temperature out of range");
        }
    }

    double getTemperature()

    {
        return temperature;
    }

    
    
}
class MAINTEMP{
    public static void main(String[] args) {
        TemperatureSensor t=new TemperatureSensor();
        t.setTemperature(450.6);
        t.getTemperature();

    }
}
