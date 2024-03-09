//throw keyword and custom exception

package Exception;

class MyException extends Exception 
{
    public MyException()
    {

    }
    public MyException(String msg)
    {
        super(msg);

    }
}

public class throw1 
{
  public static void main(String[] args) 
  {
    int num1 =8;
    int num2 = -2;
    
    try
    {
        if(num2<0)
        {
            Exception e = new MyException("Negative numbers are not allowed in denominator");
            throw e;
        }
        
        else
        {
        int result = num1/num2;
        System.out.println(result);
        }
    

    }
    catch (Exception e)
    {
        System.out.println("Enter a valid number and " + e);
    }
   
    
  }  
}
