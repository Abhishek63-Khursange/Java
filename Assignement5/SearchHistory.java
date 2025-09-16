/* Problem 5: Recent Search History
Use Case: A search application maintains the last 5 searches, removing the oldest when the limit is
exceeded.

Requirements:
● Store recent searches (maximum 5)
● Remove oldest search when limit exceeded
● Maintain insertion order

Sample Input:
Searches: "Java", "Python", "C++", "DSA", "OOP", "Spring"

Expected Output:
Recent searches: Python, C++, DSA, OOP, Spring 
*/



package Java.Assignement5;
import java.util.*;

public class SearchHistory {
    public static void main(String[] args) {
        Deque<String> recentSearches = new ArrayDeque<>();

        // sample input
        String[] inputs = {"Java", "Python", "C++", "DSA", "OOP", "Spring"};

        for (String s : inputs) {
            if (recentSearches.size() == 5) {
                recentSearches.removeFirst(); // remove oldest
            }
            recentSearches.addLast(s); // add newest at the end
        }

        System.out.print("Recent searches: ");
        for (String s : recentSearches) {
            System.out.print(s + " ");
        }
    }
}
