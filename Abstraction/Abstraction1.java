package Abstraction;


abstract class  aeroplane //abstract class has only class and no body or implementation only signature.
{
    // abstract  int age; //abstract keyword cannot be applied to variable..and constructor also.

    abstract public void takeoff(); 
   

    abstract public void fly();

    public void landing()
    {
        System.out.println("aeroplane is landing");
    }
    
}

class cargoPlane extends aeroplane
{
    public void fly()
    {

        System.out.println("cargoPlane is flying at lower height");
    }
    public void takeoff() 
    {

        System.out.println("cargoPlane requires a long runway to fly");
    }
    public void alert() 
    {
        System.out.println("alert...");
    
    }
   

}

class passangerPlane extends aeroplane
{
     public void fly()
    {

        System.out.println("passanger plane is flying at medium height");
    }

    public void takeoff() 
    {

        System.out.println("PassangerPlane requies a short runway to fly");
    }

}
    

public class Abstraction1
{
    public static void main(String[] args) 
    {
        aeroplane cp=new cargoPlane();
        cp.takeoff();
        cp.fly();
        cp.landing();

        //cp.alert(); not possible as alert() is a specialized class of cargoPlane;

        ((cargoPlane) cp).alert(); //this is called as downcasting..

        System.out.println("--------------------------------");

        aeroplane pp = new passangerPlane();
        pp.takeoff();
        pp.fly();
        pp.landing();
        
        //  aeroplane ref = new aeroplane(); we cannot make object of abstract class.. 
    }    
}
// abstract class has at least one abstract body.if it has all abstract bodies then 100% abstratction is possible.