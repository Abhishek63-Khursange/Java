/*
 * Problem 4: Grocery Shopping List
Use Case: A person maintains a grocery list and removes items as they purchase them.

Requirements:
● Add items to grocery list
● Remove purchased items
● Display remaining items

Sample Input:
Add items: "Milk", "Eggs", "Bread"
Purchase: "Milk"

Expected Output:
Items to buy: Eggs, Bread
 */

package Java.Assignement5;
import java.util.*;
public class GroceryShopping {
    public static void main(String[] args) {

        List<String> list=new LinkedList<>(Arrays.asList("Milk", "Eggs", "Bread"));
        list.remove("Milk");

        System.out.print("Items to buy: ");
        for(String s:list)
        {
            System.out.print(s+" ");
        }
        
    }
    
}
