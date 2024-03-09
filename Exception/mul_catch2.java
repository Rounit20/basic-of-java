package Exception;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class mul_catch2 {
    public static void main(String[] args) 
    {
        int num = 0;

        // try with resource

        try(Scanner sc = new Scanner(System.in); )
        {
            num = sc.nextInt();
        }

        catch( InputMismatchException e)
        {
            System.out.println("Please enter a NUMBER");
        }

        // finally
        // {
        //     sc.close();
        //     System.out.println("Resource Closed");
        // }

        if(num>0){
        System.out.println(num);}
        else if(num<0){
        System.out.println(num);}
        else if(num==0){
            System.out.println("initial value of num is " + num);
        }
        else{
        System.out.println("enter a number");}
    }
}

//DRY =  DO Not Repeat Yourself.

        