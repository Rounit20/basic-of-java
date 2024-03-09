package Inheritence;
// multilevel inheritence

class demo1
{
    void disp()
    {
        System.out.println("disp written in demo1 class");
    }
}

class demo2 extends demo1
{
    
}

class demo3 extends demo2
{
    
}

public class inheritence2 
{
    public static void main(String[] args) 
    {
        demo3 d=new demo3();
        d.disp();
    }    
}
