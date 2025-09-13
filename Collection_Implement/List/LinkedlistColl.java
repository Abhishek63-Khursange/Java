package Java.Collection_Implement.List;

import java.util.LinkedList;
import java.util.*;

public class LinkedlistColl {
    public static void main(String[] args) {

        //there are two ways to create instance if LinkedList 1) using interface name that is List 2) using same classname like Linkedlist
        List<String> linkedList=new LinkedList<>();
       //2) using same classname like Linkedlist mnjhe refrence pn same aani object on same class cha
        LinkedList<Integer> LinkInteger=new LinkedList<>();

        linkedList.add("Abhishek");
        linkedList.add("Sarang");
        linkedList.add("Vaibhav");
        linkedList.add("Aakash");
        linkedList.add("Sarang");

        System.out.println(linkedList); //maintain insertion order // it uses doubly linked list

        linkedList.remove((String)"Abhishek"); // removing by passing value

        System.out.println(linkedList);

        System.out.println(linkedList.remove(3)); // removinf by indexing

        System.out.println(linkedList);




    }
    
}
