/*
 * Problem 17: Library Book Addition
Scenario:
Create Book class with bookId, title, author.
● Constructor + Getters/Setters
● Create Library class with libraryName and static totalBooks
● Method addBook(Book b) → increments totalBooks
● Method displayTotalBooks() → prints totalBooks
● Add 2 books to library and display total books
 */

package Java.oopj.Assignment;

public class Book1 {
    int bookId;
    String title;
    String author;

    // Constructor
    Book1(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Setters
    void setBookId(int bookId) {
        this.bookId = bookId;
    }
    void setTitle(String title) {
        this.title = title;
    }
    void setAuthor(String author) {
        this.author = author;
    }

    // Getters
    int getBookId() {
        return bookId;
    }
    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
}

class Library {
    static int totalBooks;

    // Method to add a book
    void addBook(Book1 b) {
        totalBooks++; 
        System.out.println("Book Added → ID: " + b.getBookId() +
                           ", Title: " + b.getTitle() +
                           ", Author: " + b.getAuthor());
    }

    // Display total books
    static void displayTotalBooks() {
        System.out.println("Total Books in Library: " + totalBooks);
    }

    public static void main(String[] args) {
        Library lib = new Library();

        Book1 b1 = new Book1(1, "2 States", "Chetan Bhagat");
        Book1 b2 = new Book1(2, "Wings of Fire", "A.P.J. Abdul Kalam");

        lib.addBook(b1);
        lib.addBook(b2);

        Library.displayTotalBooks();
    }
}
