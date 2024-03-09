package Interface;

interface A
{
 
 void show();
}

interface C 
{
  void disp();
}

class B implements A,C // a class can implement multiple interfaces
{
    public void show()
    {
        System.out.println("in show");
    }

    public void disp()
    {
        System.out.println("in disp");
    }

}

public class INTER2 
{
    public static void main(String[] args) 
    {
       A  obj  = new B(); // at place of A we can use B also
       C obj2 = new B(); 
       obj.show();
       obj2.disp();
    }    
}

