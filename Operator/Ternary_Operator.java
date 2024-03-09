package Operator;
public class Ternary_Operator
{
    public static void main(String[] args)
    {
     int a=30;
     int b=20;
     int c=40;
     int result=(a<b)?a:b;
     System.out.println(result);
     String res=(a<b)?"a is less":"b is less";
     System.out.println(res);

     //for nesting:-

     int out=(a<b)? (a<c? a:c) : (b<c? b:c);
        System.out.println(out);

     //if else form:-

     if(a<b)
     {
         if(a < c)
         {
             System.out.println(a);
         }
         else;
         {
             System.out.println(b);
         }
     }
     else if (b<c)
     {
         System.out.println(b);
     }
     else
     {
         System.out.println(c);
     }
    }

}
