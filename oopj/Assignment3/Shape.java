/*
 * 6. Shape Area Calculation
Scenario: You are designing a program to calculate areas of different shapes.
Problem Statement:
Create a superclass Shape with a method area(). Derive two subclasses Rectangle and Circle. Implement
area() in each subclass.
Classes/Fields:
● Shape → area() (method stub)
● Rectangle → length, breadth
● Circle → radius
Methods:
● Rectangle.area() → length × breadth
● Circle.area() → π × radius²
Sample Input:
Rectangle → length=5, breadth=10
Circle → radius=7
Sample Output:
Rectangle Area = 50
Circle Area = 153.86
 */

package Java.oopj.Assignment3;

public class Shape {
    
    void area()
    {
      
      
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
     Rectangle(double length,double breadth)
     {
        this.breadth=breadth;
        this.length=length;
     }
    @Override
     void area()
     {
        double result=length*breadth;
        System.out.println("Rectangle Area = "+result);
     }
   


}
class Circle extends Shape{
    double radius;

    final double PI=3.14;

    Circle(double radius)
    {
       // this.PI=PI;
        this.radius=radius;
    }
     @Override
    void area()
    {
        double result=PI*radius*radius;
        System.out.println("Circle Area = "+result);
        
    }
    

    

}
class MainShape
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.area();

        Circle c = new Circle(7.0);
        c.area();

        
        
    }
}
