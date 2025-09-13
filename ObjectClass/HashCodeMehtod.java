package Java.ObjectClass;

public class HashCodeMehtod {
    
    String name;
    int id;

    HashCodeMehtod(String name, int id)
    {
        this.name=name;
        this.id=id;

    }
    @Override
    public String toString()
    {
        return name+" "+id;
    }
    
    @Override
    public int hashCode()
    {
       return id;
    }
   

}
class DEMOHASHMETHOD{
    public static void main(String[] args) {
        HashCodeMehtod h=new HashCodeMehtod("Abhishek", 809);
        System.out.println(h);//call toString() method
        System.out.println(h.id); //print id
    }
}
