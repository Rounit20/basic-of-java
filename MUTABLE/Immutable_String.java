package MUTABLE;
public class Immutable_String 
{
  public static void main(String[] args) 
{
    
  String name = "pw";
  System.out.println(name); 

 String name1 = new String("pw");
 System.out.println(name1);

 char[] ch = {'p','w'};
 String name2= new String(ch);
 System.out.println(name2);

 //String constant pool:-

    String s1 = "pw";
    String s2 = "pw";
    String s5 = "PW Skills";

    String s3 =  new String("PW Skills");
    String s4 =  new String("PW Skills");
    String s6 =  new String("PW SKILLS");
    

    System.out.println(s1==s2);
    System.out.println(s3==s4);
    System.out.println(s5==s3);
    System.out.println(s5.equals(s3));
    System.out.println(s5.equalsIgnoreCase(s6));  //STRING OBJECT MEIN CASE SENSITIVE HATANE KE LIYE ".equalsIgnoreCase" is used..




}  
}
