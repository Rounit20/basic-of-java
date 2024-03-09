package scanner;
import java.util.Scanner;

public class Palindrome 
{

    public static void main(String[] args) 
    {
        // String inputString = "hello world";
        
        // // Capitalize the first word
        // String capitalizedString = inputString.substring(0, 1).toUpperCase() + inputString.substring(1);

        // // Print the result
        // System.out.println(capitalizedString);
       

           
        //         String str1 = "hello";
        //         String str2 = "java";
        
        //         // Comparing two strings lexicographically
        //         int result = str1.compareTo(str2);
        
        //         // Displaying the result
        //         if (result < 0) {
        //             System.out.println(str1 + " is lexicographically less than " + str2);
        //         } else if (result > 0) {
        //             System.out.println(str1 + " is lexicographically greater than " + str2);
        //         } else {
        //             System.out.println(str1 + " is lexicographically equal to " + str2);
        //         }
        //     }
        // }
        
    
        
        // Scanner sc=new Scanner(System.in);
        // String A=sc.next();
        // sc.close();
        // String str="";
        // for(int i=A.length()-1;i>=0;i--)
        // {
        //     str+=A.charAt(i);
        // }
        // if(A.equals(str))
        // {
        //     System.out.println("Yes");
        // }
        // else
        // {
        //     System.out.println("No");
        // }



    
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        if(str.length()==3 && str.charAt(0)==str.charAt(1) && str.charAt(1)==str.charAt(2))
        {
            System.out.println("WIN");
            
        }
        else
        {
            System.out.println("Lost");
        }


    }
}
        
        
    

        
    


    

