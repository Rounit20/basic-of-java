package Interface;

interface Computer 
{
     void CompileCode();
   
}

class Developer
{
    
    public void BuildApp(Computer obj)
    {
        
        System.out.println("Building App");
        
        obj.CompileCode();

    }
}

class Laptop implements Computer
{
    public void CompileCode()
    {
        System.out.println("Compiling ");
        
    }
}

class Desktop  implements Computer
{
    public void CompileCode()
    {
        System.out.println("Compiling on desktop");
        
    }
}


public class MainInter 
{
    public static void main(String[] args) 
    {
        //Laptop obj = new Laptop();

        Computer obj1 = new Desktop();
        Computer obj2 = new Laptop();
        

        Developer dev = new Developer();
        dev.BuildApp(obj2); 
        System.out.println("--------------------------------");
        dev.BuildApp(obj1);  
    }
    
}
