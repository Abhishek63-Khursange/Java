/*
 * 9. Animal Sound
Scenario: You are building a zoo management system to play animal sounds.
Problem Statement:
Create a superclass Animal with method makeSound(). Subclass Dog and Cat override makeSound().
Classes/Fields:
● Animal → makeSound()
● Dog → “Bark”
● Cat → “Meow”
Sample Output:
Dog → Bark
Cat → Meow
 */

package Java.oopj.Assignment3;

public class Animal {

    void makeSound()
    {

    }
    
}
class Dog extends Animal{
   String sound;


   Dog(String sound)
   {
    this.sound=sound;
   }
    @Override
    void makeSound()
    {
      
      System.out.println("Dog -> "+sound);
    }
}
class Cat extends Animal{
    String sound;
    Cat(String sound)
    {
        this.sound=sound;
    }
    @Override
    void makeSound()
    {
       
        System.out.println("Cat -> "+sound);
        
    }
}

class MAINANIMAL{
    public static void main(String[] args) {

        Animal a=new Dog("Bark");
        a.makeSound();
        Animal a1=new Cat("Meow");
        a1.makeSound();
        

    }
}
