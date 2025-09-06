/*
 * 30. Library Management System
Scenario: Manage books and library members with borrowing functionality.
Problem Statement:
● Class Book777 → private variables: bookId, title, author (Encapsulation)
● Abstract Class LibraryMember → instance variables: memberId, name
○ Abstract method borrowBook(Book book)
● Class StudentMember extends LibraryMember → limit 3 books
● Class FacultyMember extends LibraryMember → limit 5 books
● Interface Notifyable → method sendNotification(String message) → notify members about
overdue books
● In main(), create 1 student and 1 faculty, borrow books, send notifications
Sample Input:
Student → borrow 2 books
Faculty → borrow 4 books
Sample Output:
StudentMember Amit borrowed 2 books
FacultyMember Prof. Singh borrowed 4 books
Notification sent to Amit: Return books within 7 days
Notification sent to Prof. Singh: Return books within 14 days
 */


 package Java.oopj.Assignment3;

 // Book class (Encapsulation)
 class Book777 {
     private int bookId;
     private String title;
     private String author;
 
     // Constructor
     Book777(int bookId, String title, String author) {
         this.bookId = bookId;
         this.title = title;
         this.author = author;
     }
 
     // Getters
     public int getBookId() {
         return bookId;
     }
 
     public String getTitle() {
         return title;
     }
 
     public String getAuthor() {
         return author;
     }
 }
 
 // Abstract Class LibraryMember
 abstract class LibraryMember {
     int memberId;
     String name;
     int borrowedBooks = 0;
 
     LibraryMember(int memberId, String name) {
         this.memberId = memberId;
         this.name = name;
     }
 
     abstract void borrowBook(Book777 book);
 }
 
 // Interface
 interface Notifyable {
     void sendNotification(String message);
 }
 
 // StudentMember
 class StudentMember extends LibraryMember implements Notifyable {
     private static final int LIMIT = 3;
 
     StudentMember(int memberId, String name) {
         super(memberId, name);
     }
 
     @Override
     void borrowBook(Book777 book) {
         if (borrowedBooks < LIMIT) {
             borrowedBooks++;
         } else {
             System.out.println("Student " + name + " cannot borrow more than " + LIMIT + " books.");
         }
     }
 
     @Override
     public void sendNotification(String message) {
         System.out.println("Notification sent to " + name + ": " + message);
     }
 }
 
 // FacultyMember
 class FacultyMember extends LibraryMember implements Notifyable {
     private static final int LIMIT = 5;
 
     FacultyMember(int memberId, String name) {
         super(memberId, name);
     }
 
     @Override
     void borrowBook(Book777 book) {
         if (borrowedBooks < LIMIT) {
             borrowedBooks++;
         } else {
             System.out.println("Faculty " + name + " cannot borrow more than " + LIMIT + " books.");
         }
     }
 
     @Override
     public void sendNotification(String message) {
         System.out.println("Notification sent to " + name + ": " + message);
     }
 }
 
 // Main class
 class LibraryMain123 {
     public static void main(String[] args) {
         // Create Books
         Book777 b1 = new Book777(1, "Java Programming", "James Gosling");
         Book777 b2 = new Book777(2, "Data Science", "Andrew Ng");
         Book777 b3 = new Book777(3, "Operating Systems", "Silberschatz");
         Book777 b4 = new Book777(4, "Database Systems", "Navathe");
 
         // Create Members
         StudentMember student = new StudentMember(101, "Amit");
         FacultyMember faculty = new FacultyMember(201, "Prof. Singh");
 
         // Borrow Books
         student.borrowBook(b1);
         student.borrowBook(b2);
 
         faculty.borrowBook(b1);
         faculty.borrowBook(b2);
         faculty.borrowBook(b3);
         faculty.borrowBook(b4);
 
         // Display Results
         System.out.println("StudentMember " + student.name + " borrowed " + student.borrowedBooks + " books");
         System.out.println("FacultyMember " + faculty.name + " borrowed " + faculty.borrowedBooks + " books");
 
         // Notifications
         student.sendNotification("Return books within 7 days");
         faculty.sendNotification("Return books within 14 days");
     }
 }
 