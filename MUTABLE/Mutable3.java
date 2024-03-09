package MUTABLE;

import polymorphism.polymorphism1;

public class Mutable3 
{
    public static void main(String[] args) 
    {
      StringBuffer sb=new StringBuffer();// same for stringbuilder
      System.out.println(sb.capacity());  //how many characters we can put.
      System.out.println(sb.length()); //how many charaters are present

      StringBuffer str = new StringBuffer();
      str.append("sachin"); 
      System.out.println(str.capacity());

      StringBuffer sb2 = new StringBuffer("sachin");
      System.out.println(sb2);    
      System.out.println(sb2.capacity());
      System.out.println(sb2.charAt(1));
      sb2.setCharAt(1,'A');
      System.out.println(sb2);

      StringBuffer sb3 = new StringBuffer(150);
      System.out.println(sb3.capacity());
      sb3.append("java");
      System.out.println(sb3);
      sb3.trimToSize();
      System.out.println(sb3.capacity());

      StringBuilder sb4 = new StringBuilder("pwjava");
      System.out.println(sb4);
      System.out.println(sb4.reverse());
        //  System.out.println(sb4.toString());  iske bare mein pata karna hai..

           
    }
}
