package Java.oopj.Association;

//import javax.swing.text.AttributeSet.ColorAttribute;

public class Composition { //class Engine
    String type;

    Composition(String type)
    {
        this.type=type;
    }
    void display1()
    {
        System.out.println(type);
    }
}

class car{
    String color;
    String model;
    Composition engine; //HAS-A Relationship with Composition class

    car(String color,String model,String enginetype)
    {
        this.color=color;
        this.model=model;
        this.engine=new Composition(enginetype); //creating object inside the constructor

    }
    void display()
    {
        System.out.println("Model: "+model + "Color: "+color +"Engine Type: "+engine.type);
    }

}
class MAIN{
    public static void main(String[] args) {
        car c=new car("Balck", "BMW", "Diseal");
        Composition com=new Composition("Petrol");
        c.display();
        com.display1();
    }
}
