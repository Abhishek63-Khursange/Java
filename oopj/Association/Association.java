package Java.oopj.Association;

public class Association {

    String Name;
    int id;
    Address address;  // HAS-A Relationship with Address class

    Association(String Name,int id, Address address )//Refrence
    {
       this.Name=Name;
       this.id=id;
       this.address=address;

    }
    void display()
    {
        System.out.println("Employee details: "+ "ID: " +id +" Name: "+Name);
        System.out.println("Adress is: "+address.City+" "+address.State+" "+address.Country+" "+address.pincode);
        
    }
}
class Address{
    String City;
    String State;
    String Country;
    int pincode;
    
    Address(String City,String State,String Country,int pincode)
    {
        this.City=City;
        this.State=State;
        this.Country=Country;
        this.pincode=pincode;
    }
    void display1()
    {
        System.out.println("Adress is: "+City+" "+State+" "+Country+" "+pincode);
    }

}
class MAINDemo{
  public static void main(String[] args) {
    
    Address adress=new Address("Nagpur", "Maharashtra", "India", 440023);
    Address adress1=new Address("Mumbai", "Maharashtra", "India", 440028);
   // a.display1();

    Association a2=new Association("Abhishek", 202, adress);
    Association a3=new Association("Sarang", 203, adress);
    a2.display();
    a3.display();
    
  }

}
