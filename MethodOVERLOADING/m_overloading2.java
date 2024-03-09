package MethodOVERLOADING;

class calc //AUTOMATIC PROMOTION IN OVERLOADING
{
    public void show(byte n)
    {
        System.out.println("byte" + n);
    }
    public void show(short n)
    {
        System.out.println("short" + n);
    }
    public void show(char n)
    {
        System.out.println("char" + n);
    }
    public void show(int n)
    {
        System.out.println("int" + n);
    }
    public void show(double n)
    {
        System.out.println("double" + n);
    }

}
public class m_overloading2
{
    public static void main(String[] args)
    {
        calc obj= new calc();
        int b=1;
        obj.show(b);
        
    }
}
