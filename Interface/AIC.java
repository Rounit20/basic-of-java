package Interface;


interface car
{
    void drive();
}

    


public class AIC 
{
    public static void main(String[] args) 
    {
     car w = new car() 
     {
          public void drive()
          {
             System.out.println("DRIVING");
          }
     };
      w.drive();   
     
    }
    
}
