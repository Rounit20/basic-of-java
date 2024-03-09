package Interface; // JAVA 8 FEATURES

interface A 
{
    void show();

    default void disp() // we have to use default
    {
        System.out.println("in  default");
    }

    static void disp2() // we can call static method directly
    {
        System.out.println("in static ");
    }
}

class B implements A 
{
    public void show() 
    {
        System.out.println(" In class ");
    }

    public void display() {
    }
}

public class inter3 {
    public static void main(String[] args) 
    
    {
        A.disp2(); //we can call static method directly

        A obj = new B();
        obj.show();
        obj.disp();

    }
}
