/*
 * 27. Shape Area Calculator
Scenario: A drawing application needs to calculate area for different shapes: Circle, Rectangle, and
Square.

Problem Statement:
● Interface Shape → method calculateArea()
● Classes Circle, Rectangle, Square implement Shape → provide specific area calculation
● In main(), create objects of each shape, input dimensions, display calculated area

Sample Input:
Circle → radius=5
Rectangle → length=10, breadth=5
Square → side=4

Sample Output:
Circle Area = 78.5
Rectangle Area = 50
Square Area = 16
 */

 package Java.oopj.Assignment3;

 public interface Shape14 {
     void calculateArea();
 }
 
 class Circle15 implements Shape14 {
     int radius;
     Circle15(int radius) {
         this.radius = radius;
     }
     public void calculateArea() {
         double PI = 3.14;
         double area = PI * radius * radius;
         System.out.println("Circle Area = " + area);
     }
 }
 
 class Rectangle15 implements Shape14 {
     int length;
     int breadth;
     
     Rectangle15(int length, int breadth) {
         this.length = length;
         this.breadth = breadth;
     }
 
     public void calculateArea() {
         int area = length * breadth;
         System.out.println("Rectangle Area = " + area);
     }
 }
 
 class Square1 implements Shape14 {
     int side;
     Square1(int side) {
         this.side = side;
     }
 
     public void calculateArea() {
         int area = side * side;  
         System.out.println("Square Area = " + area);
     }
 }
 
 class MainSHAPEE {
     public static void main(String[] args) {
         Circle15 c = new Circle15(5);
         Rectangle15 r = new Rectangle15(10, 5);
         Square1 s = new Square1(4);
 
         c.calculateArea();
         r.calculateArea();
         s.calculateArea();
     }
 }
 