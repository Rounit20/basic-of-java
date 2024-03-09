package Exception;

public class try_mul_catch 
{
    public static void main(String[] args) 
    {
        int num1= 10;
        int num2= 5 ;
        int result =0;
        int Arr[]={ 3,4,5,67,56};
        
        String name = null;
        try
        {

         result = num1 / name.length(); ;
         System.out.println(Arr[6]);
         // System.out.println("in try block"); ye skip ho jayega agar exception ayega toh.

        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot DEVIDE by ZERO" );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("INVALID INDEX NUMBER");
            System.out.print("last element : ");
            System.out.println(Arr[Arr.length-1]);
        }
        catch(Exception e) //Null pointer exception 
        {
            System.err.println("Something Went Wrong");
        }
        
        System.out.println();
        System.out.println("result is :" + result);
        System.out.println("Bye");
        
    }

}

