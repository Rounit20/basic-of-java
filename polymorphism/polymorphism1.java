package polymorphism;

class  aeroplane 
{
    public void takeoff() 
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
    public void fly()
    {

        System.out.println(" cargoPlane is flying at lower height");
    }
    public void takeoff() 
    {

        System.out.println("cargoPlane requires a long runway to fly");
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
    

public class polymorphism1
{
    public static void main(String[] args) 
    {
        cargoPlane cp=new cargoPlane();
        passangerPlane pp = new passangerPlane();
        aeroplane ref;

       ref=cp;
       ref.takeoff();
       ref.fly();
       
        System.out.println("--------------------------------");
         
        ref=pp;
        ref.takeoff();
        ref.fly();



    }    
}


