/*
 * Problem 3: Library Book Tracker
Scenario: A library in Delhi wants to track how many books are issued in total and details of each book.
Requirements:
1. Create a Book class with instance variables: title (String), author (String), issued (boolean).
2. Create static variable totalIssuedBooks to keep track of the total number of books issued.
3. Create a constructor to initialize the book details.
4. Create getters and setters for all instance variables.
5. Create a static method showTotalIssued() to print total issued books.
6. Write a main class to create 3 books, issue some of them (issued = true), and show total issued
books.
Input Example:
Book1: "Harry Potter", Author: "J.K. Rowling", Issued: true
Book2: "Five Point Someone", Author: "Chetan Bhagat", Issued: false
Book3: "Rich Dad Poor Dad", Author: "Robert Kiyosaki", Issued: true
Expected Output:
Book1 issued? true
Book2 issued? false
Book3 issued? true
Total books issued: 2
 */




package Java.oopj.Assignment;

public class Book {
    private String title;
    private String author;
    private boolean issued;
    private static int totalIssuedBooks;

    // Constructor
    Book(String t, String a, boolean b) {
        this.title = t;
        this.author = a;
        this.issued = b;
        if (b) {
            totalIssuedBooks++; // increment count if book is issued
        }
    }

    // Getters
    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    boolean getIssued() {
        return issued;
    }

    // Setters
    void setTitle(String t) {
        this.title = t;
    }

    void setAuthor(String a) {
        this.author = a;
    }

    void setIssued(boolean b) {
        
        if (!this.issued && b) {
            totalIssuedBooks++;
        } else if (this.issued && !b) {
            totalIssuedBooks--;
        }
        this.issued = b;
    }

    // Static method
    static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book book2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);

     
        System.out.println("Book1 issued? " + book1.getIssued());
        System.out.println("Book2 issued? " + book2.getIssued());
        System.out.println("Book3 issued? " + book3.getIssued());

        
        Book.showTotalIssued();
    }
}
