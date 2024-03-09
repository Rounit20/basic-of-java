package scanner;
import java.util.Scanner;


public class fibonacci 
{
    public static  void main(String[] args) 
    {
        int i;
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        sc.close();
        long[] a = new  long [k];
        a[0] =0;
        a[1] =1;
        
        // System.out.println(a[0]);
        for(i=2; i<k; i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        for(i=0; i<k; i++)
        {
            System.out.print(a[i]+ " ");
        }
        
    }
    
}
