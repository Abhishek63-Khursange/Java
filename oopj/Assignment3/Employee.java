/*
 * 3. Employee Age Validation
Scenario: HR wants to ensure employees entered in the system are adults.
Problem Statement:
Create a class Employee with private age. Provide getter/setter. Setter should reject age < 18.
Fields:
● private int age
Methods:
● setAge(int age) → if age >=18, set; else show error
● getAge() → returns age
Sample Input:
age = 17
Sample Output:
“Invalid age”

 */



package Java.oopj.Assignment3;

public class Employee {
    private int age;


    //setter
    
void setage(int age)
{
    if(age>=18)
    {
        this.age=age;
    }
    else{
        System.out.println("Inavalid age" );
    }
}

//getter
int getAge()
{
    return age;
}
    
}
class MainEmployee{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setage(17);
    }
}
