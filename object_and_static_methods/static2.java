package object_and_static_methods;
class demo
  {
     static int a;
     static int b;

     int m;
     int n;

    static
    {
     System.out.println("CONTROL IN STATIC BLOCK");
     a = 19;
     b=18;
    }

    {
        System.out.println("control in   NON STATIC BLOCK");
        m=17;
        n=16;
    }

    static void disp1()
    {
        System.out.println("value of  static variable a: "+ a);
        System.out.println("value of static variable b: "+ b);
    }

     void disp2()
    {
        System.out.println("value of non static variable m: "+ m);
        System.out.println("value of  non static variable n: "+ n);
    }
  }

public class static2
{
   public static void main(String[] args) 
  {
    demo d = new demo();
    demo.disp1();
    d.disp2();
   }  



}
 
  
   
