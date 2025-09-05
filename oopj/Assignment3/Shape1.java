/*
 * 13. Shape Drawing
Scenario: A graphics program needs to draw different shapes.
Problem Statement:
Create an abstract class Shape with abstract method draw(). Subclass Circle and Rectangle implement
draw().

Classes/Fields:
● Shape → draw() (abstract)
● Circle → radius
● Rectangle → length, breadth

Sample Input:
Circle → radius=7
Rectangle → length=5, breadth=10
Sample Output:

Drawing Circle of radius 7
Drawing Rectangle of length 5 and breadth 10
 */


package Java.oopj.Assignment3;

public abstract class Shape1 {
    abstract void draw();

    
}

class Circle1 extends Shape1{
   int radius;

    Circle1(int radius)
    {
        this.radius=radius;
    }

    @Override
    void draw()
    {
        //Drawing Circle of radius 7
        System.out.println("Drawing Circle of radius "+7);

    }
    

}

class Rectangle1 extends Shape1{
   int length;
    int breadth;

    Rectangle1(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    void draw()
    {
        //Drawing Rectangle of length 5 and breadth 10
        System.out.println("Drawing Rectangle of length "+length+" and"+" breadth "+breadth);

    }

}
class Abhishek{
    public static void main(String[] args) {
         Shape1 s=new Circle1(7);
         Shape1 s1=new Rectangle1(5,10);

         s.draw();
         s1.draw();
    }
}