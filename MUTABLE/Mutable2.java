package MUTABLE;
public class Mutable2
{
    public static void main(String[] args) 
    {
      int a = 10;
      a=20;
      System.out.println(a);
      
     final int b= 29;
     // b=34; here it will show error with a red line under b.
     System.out.println(b);

     String s ="virat";
     s= s.concat("kohli");
     System.out.println(s);

     StringBuffer sb = new StringBuffer("virat");
     sb.append("kohli");
     sb = new StringBuffer("sachin");
     System.out.println(sb);

      final StringBuffer sb1= new StringBuffer("virat");
      
     sb1.append("kohli"); //yaha pe error nhi hai iska matlab final keyword doesnot change mutable string to immutable string..

    // sb1 = new StringBuffer("sachin"); HERE IT WILL SHOW UNDER sb1

     System.out.println(sb1);

     

    }    
}
