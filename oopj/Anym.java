package Java.oopj;

interface Anym1 {
    public void readbook();
}

public class Anym {
    public static void main(String[] args) {

        // Create an anonymous class that implements Anym   Anym1 a = new Anym1(){};
        Anym1 a = new Anym1() {
            @Override
            public void readbook() {
                System.out.println("Hello, this is an anonymous class.");
            }
        };

        a.readbook(); // Call the method
    }
}

/*An anonymous class in Java is a class without a name that you define and instantiate in a single expression. It's usually used when you need to create an object with slight custom behavior without writing a full separate class file.

Key points about anonymous classes

They don't have a name.

They are usually created inside a method or block.

They are often used to:

Implement an interface on the fly.

Extend an abstract class or regular class temporarily.

They cannot have explicit constructors (because they don't have a name).

They are compiled as inner classes (e.g., OuterClass$1.class). */
