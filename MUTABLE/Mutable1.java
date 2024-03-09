package MUTABLE;
public class Mutable1 
{
    public static void main(String[] args) 
    {
      StringBuffer sb = new StringBuffer("virat")  ;//we can use stringbuilder too..
      System.out.println(sb);
      
      //Note:-
      //StringBuffer sb="";  THIS IS INVALID.

      sb.append("kohli");
      System.out.println(sb);

    }    
}
