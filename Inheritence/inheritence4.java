package Inheritence;
// multilevel inheritence

class  aeroplane // extends object
{
    public void takeoff() //inherited method
    {

        System.out.println("aeroplane is taking off");
    }

    public void fly()
    {
        
        System.out.println("aeroplane is flying");
    }
}

class cargoPlane extends aeroplane
{
    public void fly()// overriding methods
    {

        System.out.println(" cargoPlane is flying at lower height");
    }
    public void cargoGoods()//specialized method
    {
        System.out.println("CargoPlane carries goods");
    }

}

class passangerPlane extends aeroplane
{
     public void fly()// overriding methods
    {

        System.out.println("passanger plane is flying at medium height");
    }

    public void carryPassanger()//specialized method
    {
        System.out.println("PassangerPlane carries passaenger");
    }

}
    

public class inheritence4
{
    public static void main(String[] args) 
    {
        cargoPlane cp=new cargoPlane();
        cp.fly();
        cp.takeoff();
        cp.cargoGoods();

        System.out.println("--------------------------------");

        passangerPlane pp = new passangerPlane();
        pp.fly();
        pp.takeoff();
        pp.carryPassanger();


    }    
}
// note:-
// A .We cannot decrease the visibility during overriding.
//   1. public
//   2. protected
//   3. default
//   4. private
//      visibility decreases in this order

// B. we cannot change the return type during overriding.

// C. parameters and arguments lists should be same ..else method overloading concept is used...
