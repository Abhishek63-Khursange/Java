/*
 * 15. Shape Area Calculation
Scenario: A program needs to calculate the area of different shapes using the same method name but
different parameters.
Problem Statement:
Create a class ShapeArea with overloaded methods calculateArea().

Methods:
● calculateArea(int side) → calculates area of square
● calculateArea(int length, int breadth) → calculates area of rectangle
● calculateArea(double radius) → calculates area of circle

Sample Input:
Square → side=5
Rectangle → length=4, breadth=6
Circle → radius=3


Sample Output:
Square Area = 25
Rectangle Area = 24
Circle Area = 28.26
 */

package Java.oopj.Assignment3;
public class ShapeArea{
    int side;
    int length;
    int breadth;
    double radius;

    void calculateArea(int side)
    {
        this.side=side;
        int square=side*side;
        System.out.println("Square Area = "+square);


    }

    void calculateArea(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        int Rectangle=length*breadth;
        System.out.println("Rectangle Area = "+Rectangle);

    }

    void calculateArea(double radius)
    {
        this.radius=radius;
        final double PI=3.14;
        double Circle=PI*radius*radius;
        //System.out.println("Circle Area = "+Circle);
        System.out.println("Circle Area = " + String.format("%.2f", Circle));

    }


}
class MAINSHAPEE{
    public static void main(String[] args) {
        ShapeArea s=new ShapeArea();
        s.calculateArea(5);
        s.calculateArea(4, 6);
        s.calculateArea(3.0);
    }
}