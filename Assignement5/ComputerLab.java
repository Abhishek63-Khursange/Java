/*
 * Problem 2: Lab Access Queue System
Use Case: A computer lab needs to manage students waiting for access using a first-come-first-served
system.

Requirements:
● Students join the queue for lab access
● Process students in FIFO order
● Display remaining queue

Sample Input:
Enqueue: "Amit", "Priya", "Rohan"
Dequeue: 1 student

Expected Output:
Queue: Priya, Rohan
 */


package Java.Assignement5;
import java.util.*;
public class ComputerLab {
    public static void main(String[] args) {
        Queue<String> Students=new ArrayDeque<>(Arrays.asList("Amit","Priya","Rohan"));
        Students.remove();
        System.out.println(Students);
        
    }
    
}
