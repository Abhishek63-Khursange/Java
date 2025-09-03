package Java.oopj;

public abstract class AbstractClass {

   public abstract void display(); //abstract method

   void display1() //concrete method
   {
      System.out.println("hello this is concrete method");
   }
   int x1=20;
    
}

class abstract1 extends AbstractClass{ 
        @Override
        public void display()    //using other class we are initialozing the abstract method
        {
            System.out.println("Hello this is the Abstract method ");
        }
       void display2()
       {
        System.out.println("this is extend class method ");
       }
int x=30;
}

class execute
{
    public static void main(String[] args) {
        abstract1 a=new abstract1();

      AbstractClass a2=new abstract1();
       //refrence     =      object
          // Abstract class का object नहीं बना सकते, सिर्फ़ reference बनता है। इस तरह हम base class को “template” की तरह use करते हैं।
        a2.display();
        a2.display1();
        a.display2();
        System.out.println(a.x1);
        System.out.println(a.x);

    }

}
           

/*  Abstract classes in Java are used when you want to share some common code among related classes but still enforce certain methods to be implemented by the subclasses. Think of it as a "half-built blueprint"—some parts are already constructed, and some parts you must finish when you create a subclass.

Why do we use abstract classes?
1. To define a common template

You can put shared variables and methods in the abstract class.

Subclasses automatically inherit them and don’t have to reimplement common logic.

2. To enforce certain methods to be implemented

If you mark a method as abstract, every non-abstract subclass must implement it.

This enforces a contract for subclasses to follow.

3. To prevent direct object creation

You cannot instantiate an abstract class directly.

This makes sense when the class is incomplete on its own and is only meant to be a parent.

4. To combine both abstract (incomplete) and concrete (ready-made) methods

Unlike interfaces (before Java 8), abstract classes can contain:

Abstract methods (no body → must be implemented by subclasses)

Concrete methods (fully implemented → can be inherited as-is)

Member variables (fields), constructors, and static methods.

When should you use an abstract class (instead of an interface)?

Use abstract class if:

Classes are closely related (e.g., Car, Bike, Truck all extend Vehicle).

You need shared code (common methods or fields).

You want to provide default behavior that subclasses can override.

Use interface if:

You just want to define a contract without worrying about code reuse.

Unrelated classes need to share behavior (e.g., Printer and Dog both can Printable or Speakable).

*/