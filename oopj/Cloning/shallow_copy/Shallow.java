package Java.oopj.Cloning.shallow_copy;

public class Shallow{

public static void main(String[] args) {
    int [] original={1,2,3,4};
    int[] shallow_copy=original;

    System.out.println(original);
    System.out.println(shallow_copy);

    shallow_copy[0]=100;
    System.out.print("shallow_copy elements: ");
    for (int i : shallow_copy) {
        System.out.print ("  "+i);
        
    }
    System.out.println("original copy elements: ");
    for (int i : original) {
        System.out.print("  "+i);
    }
}
}

/*
 * shallow copy copy the reference of the original one not the data
 * both original and copy object point to the same memory
 * changes in one object reflect in another also
 */