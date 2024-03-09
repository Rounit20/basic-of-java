package Exception;

public class ExceptionFIRST 
{
    public static void main(String[] args) 
    {
        int num1= 10;
        int num2= 0 ;
        int result = 0 ;
        try
        {
         result = num1 / num2 ;
         // System.out.println("in try block"); ye skip ho jayega agar exception ayega toh.

        }
        catch(Exception e)
        {
            System.out.println("SOMETHING WENT WRONG " + e);
        }
        
        System.out.println("result is :" + result);
        
    }

}
