package Abstraction;

// final class Animal // final class will not be inherited // we will get compile time error.

class Animal
{
    final int age =20;

    final void sleep() // this final method will take part in inheritence but we  cannot override it in child class.
    {
        // age =19; //Not possible as int  variable is declared final..

        System.out.println("Animal is sleeping");
    }
}

class Tiger extends Animal
{
    //   void sleep()    // not possible as it final method.
    //     {

    //     }
  
}

public class FinalK 
{
    public static void main(String[] args) 
    {
        Tiger t =new Tiger();
        t.sleep();
        
    }    
}
