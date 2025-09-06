/*
 * 21. Hospital Staff
Scenario: Hospital has Staff members. Both Doctors and Nurses are Staff.

Problem Statement:
● Staff → name, staffId, displayDetails()
● Doctor → specialization, displayDetails() override
● Nurse → shift, displayDetails() override

Sample Input:
Doctor → name=Dr. Reddy, staffId=101, specialization=Cardiology
Nurse → name=Nisha, staffId=102, shift=Night

Sample Output:
Dr. Reddy → Staff ID=101, Specialization=Cardiology
Nisha → Staff ID=102, Shift=Night
 */


package Java.oopj.Assignment3;



public class Staff11 {
    String name;
    int ID;

    Staff11(String name,int ID)
    {
        this.ID=ID;
        this.name=name;

    }

    void displayDetails()
    {
           
    }
    
}
class Doctor extends Staff11{
    String Specialization;

    Doctor(String name,int ID,String Specialization)

    {
        super(name,ID);
        
        this.Specialization=Specialization;
        
        
    }

    void displayDetails()
    {
        //Dr. Reddy → Staff ID=101, Specialization=Cardiology
        System.out.println(name+" -> Staff ID="+ID+", Specialization="+Specialization);

    }
}
class Nurse extends Doctor{
    String Shift;

    Nurse(String name, int id, String Shift){
        super(name, id,Shift);



    }
    
    void displayDetails()
    {
        //Nisha → Staff ID=102, Shift=Night
        System.out.println(name+" -> Staff ID="+ID+", Shift="+Shift);

    }
}
class MAinSTAFF{
    public static void main(String[] args) {
        Nurse n=new Nurse("Nisha", 102, "Night");
        Doctor d=new Doctor("Dr. Reddy", 101, "Cardiology");
        d.displayDetails();
        n.displayDetails();

    }
}