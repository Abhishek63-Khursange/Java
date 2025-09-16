/*
 * Problem 15: Library Book Inventory
Use Case: Track available copies of books in a library system.

Requirements:
● Map book titles to available copies
● Update copies when books are borrowed
● Display current inventory

Sample Input:
Initial inventory: "Java" → 3, "Python" → 5
Borrow: "Java" (1 copy)
Expected Output:
Current inventory: Java:2, Python:5
 */

package Java.Assignement5;
import java.util.*;
public class BookInventory {
    public static void main(String[] args) {
        Map<Object,Object>books=new LinkedHashMap<>();
        books.put("Java", 3);
        books.put("Pyhton", 5);

        books.put("Java", 2);

        System.out.print("Current inventory: ");
        for(Map.Entry<Object,Object> entry: books.entrySet())
        {
            System.out.print(entry.getKey()+":"+entry.getValue()+", ");
        }
    }
    
}
