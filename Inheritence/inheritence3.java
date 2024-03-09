package Inheritence;
// multilevel inheritence

class  animal // extends object
{
    void disp()
    {
        System.out.println("disp written in animal class");
    }
}

class tiger extends animal
{
    
}

class deer extends animal
{
    
}

public class inheritence3
{
    public static void main(String[] args) 
    {
        animal d=new animal();
        d.disp();
    }    
}

