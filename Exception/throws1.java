//handling vs ducking an exception

package Exception;

class Demo1
{
    public void a() throws Exception
    {
        b();
    }
    public void b() throws  Exception
    {
        int num1 =8;
        int num2 = 0;
        int result = num1/num2;
        System.out.println(result);
    }
}

public class throws1
{
    public static void main(String[] args) 
    {

       Demo1 obj= new Demo1();
       try
       {
         obj.a();
       }
       catch (Exception e)
       {
        System.out.println("Cannot Divide by zero , MESSAGE  =  " + e.getMessage());
       }

    }
}
