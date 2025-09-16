/*
 * Problem 10: Electronic Voting System
Use Case: Track unique voters in an election system to prevent duplicate voting.

Requirements:
● Record voter IDs
● Ensure one vote per voter
● Count total unique voters

Sample Input:
Voter IDs: 201, 202, 203, 202
Expected Output:
Total voters: 3
 */


package Java.Assignement5;
import java.util.*;

class ElectionSystemDuplicate{
    public static void main(String[] args) {
        Set<Integer> voteID=new LinkedHashSet<>(Arrays.asList(201, 202, 203, 202));
        System.out.println("Total voters: "+voteID.size());
    }



}