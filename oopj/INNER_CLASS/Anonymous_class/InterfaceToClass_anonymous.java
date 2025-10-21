package Java.oopj.INNER_CLASS.Anonymous_class;

public interface InterfaceToClass_anonymous {
          void display();
    
} 
class demoMainanonymousInterface{
    public static void main(String[] args) {
        
   
    InterfaceToClass_anonymous i1=new InterfaceToClass_anonymous() {
        public void display()
        {
            System.out.println("this is the interface implemention ");
        }
    };
    i1.display();
}
}