package Constructor;

class Demo
{
    private int a;
    private int b;

    //public Demo()  YE BEHIND THE SCENE BAN JATA HAI JAVA COMPILER SE.. DEFAULT CONSTRUCTOR.BAS 0 paramatize hota hai.
    //{   //NOTE:- DEFAULT CONSTRUCTOR TABHI INCLUDE HOTA HAI IF AND ONLY IF PURE PROGRAM MEIN KAHI BHI CONSTRUCTOR NHI HAI...

    //}

    public Demo()
    {
        System.out.println("zero paramaterized condructor");
    }

     public Demo(int a, int b)  //ye constructor hai...
    {
        this.a = a;
        this.b = b;
    }

    void disp()
    {
        System.out.println(a + " " + b );
        
    }
}
public class Constructor2 
{
   public static void main(String[] args) 
   {
     
     //Demo d = new Demo();    ISME ERROR AYEGA KYUKI WE HAVE INCLUDED THE CONSTRUCTOR...NOW WE USE THIS AS

     Demo d = new Demo();
     d.disp();
    
     Demo d2 = new Demo(15,25);
     d2.disp();
   } 
}
