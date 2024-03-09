package Inheritence;

class demo1
{
    int a,b;
    public demo1()
    {
        System.out.println("paraent class constructor");
    }
    public demo1(int x,int y)
    {
        System.out.println("parametarized parent class constructor");
        a=x;
        b=y;

    }
}

class demo2 extends demo1
{
    int m,n;
    public  demo2()
    {
        super();
        System.out.println(" child class constructor");
    }
    public demo2(int x,int y)
    {
        super(24,44);
        System.out.println("parametarized child class constructor");
        m=x;
        n=y;
        
    }
    
    
}   
public class inheritence5 
{
    public static void main(String[] args) 
    {
        demo2 d = new demo2();
    }    
}
