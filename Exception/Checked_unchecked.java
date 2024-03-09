// checked and unchecked exception class and heirarchy of exception class
//unchecked exception ==compiler does not check the exception
//checked exception ==compiler checks the exception and force us to handle it EG: BufferedReader

package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Checked_unchecked 
{
    public static void main(String[] args) 
    {
        int result =7/1;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            String str =reader.readLine();
        } 
        catch (IOException e) 
        {
            
            e.printStackTrace();
        }
       
       System.out.println();
       System.out.println(result);   
        

    }    
}
