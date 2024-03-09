package CONCAT;
public class Concatenation 
{
    public static void main(String[] args) 
    {
      String s1 = new String("pw");
      s1 =s1.concat("skills");
      System.out.println(s1);


      String s2="pwjava";
      String s3=s2.concat("skills");
      String s4 = new String("pwjava");
      s4 = s4.concat("skills");
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);


      String s7= "pw";
      String s8= "pw"+"java";
      String s9= "pw"+"java"+"blr";
      String s10= s7+s8;
      System.out.println(s7);
      System.out.println(s8);
      System.out.println(s9);
      System.out.println(s10);// but its memory will be in the heap area outside of the scp area


      String s11= "pw"+ 100+61;
      System.out.println(s11);
    }    
}
