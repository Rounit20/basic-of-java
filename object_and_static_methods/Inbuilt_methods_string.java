public class Inbuilt_methods_string 
{
    public static void main(String[] args) 
    {
       String str="pw skills Java";
       System.out.println(str);
       System.out.println(str.toUpperCase()); 
       System.out.println(str.toLowerCase());
       System.out.println(str.length());

       //..int length = str.length(); //used in real life development...

       System.out.println(str.charAt(5));

       System.out.println(str.substring(3,6));
       System.out.println(str.indexOf("s"));
       System.out.println(str.indexOf("a"));
       System.out.println(str.lastIndexOf("a"));

    }    
}
