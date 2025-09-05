/*
 * 4. Library Book Availability
Scenario: A library wants to keep track of available copies without letting external code change it
directly.
Problem Statement:
Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies.
Fields:
● private int copiesAvailable
Methods:
● addCopies(int n) → add copies
● removeCopies(int n) → subtract if enough copies
● getCopiesAvailable() → return current copies
Sample Input:
add 3 copies, remove 1 copy
Sample Output:
Copies available = 2
 */

package Java.oopj.Assignment3;

public class Book {
    private int copiesAvailable;

    void addCopies(int n) {
        copiesAvailable = copiesAvailable + n;   
    }

    void removeCopies(int n) {
        if (n <= copiesAvailable) {
            copiesAvailable = copiesAvailable - n;  
        }
    }

    int getCopiesAvailable() {
        return copiesAvailable;
    }

    public static void main(String[] args) {
        Book b = new Book();

        b.addCopies(3);     // add 3 copies
        b.removeCopies(1);  // remove 1 copy

        System.out.println("Copies available = " + b.getCopiesAvailable());
    }
}
