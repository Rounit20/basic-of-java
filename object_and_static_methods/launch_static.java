public class launch_static 
{

  static int a ;

  public static void main(String[] args) 
   {
    System.out.println("main block");
 
   }
 
 static
 {
    a=10;
    System.out.println("static block");//pehle static block execute hoga.kyuki memory class loading ke samay allocate ho jayega...

   
    System.out.println(a);
  }


}


