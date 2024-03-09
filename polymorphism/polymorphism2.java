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

class FighterPlane extends aeroplane
{
     public void fly()
    {

        System.out.println("Fighter plane is flying at  high heigt");
    }

    public void takeoff() 
    {

        System.out.println("Fighter Plane requies a small size runway to fly");
    }

}


class Airport
{
    public void poly(aeroplane ref)
    {
            ref.takeoff();
            ref.fly();
            System.out.println("----------------------------------");
    }
}
    

public class polymorphism2
{
    public static void main(String[] args) 
    {
        cargoPlane cp=new cargoPlane();

        passangerPlane pp = new passangerPlane();

        FighterPlane fp = new FighterPlane();
        
        Airport a = new Airport();
       
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

    }    
}


