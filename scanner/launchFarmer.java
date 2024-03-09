package scanner;
import java.util.Scanner;

class Farmer
{
    int pa;
    float td;
    static float roi;
    float si;
    static
    {
       roi=4.5f;
     }
    
    void input()
    {
        
        try (Scanner scan = new Scanner(System.in)) 
        {
            System.out.println("Please enter the amount required");
            pa=scan.nextInt();
            System.out.println("Please enter the Time duration ");
            td=scan.nextFloat();
        }
        
        
    }

    void compute()
    {
        si =(pa*td*roi)/100f;
    }

    void disp()
    {
        System.out.println("SI is : " + si);
    }
}

public class launchFarmer 
{
  public static void main(String[] args)
 
  {
     Farmer F1 = new Farmer();
     
      F1.input();
      F1.compute();
      F1.disp();

  }  
}
