package MethodOVERLOADING;
//METHOD OVERLOADING:-
class calc1       
{
       public int  add(int n1 , int n2)
    {
            int result = n1 +n2;
             return result;
    }
      public int  add(int n1 , int n2, int n3)
    {
        int result = n1 +n2 +n3;

        return result;
    }
    public double  add(double n1 , double n2, double n3)
    {
        double result = n1 +n2 +n3;
        return result;
    }
}

public class m_overloading
{
    public static void main(String[] args)
    {
        calc1 obj = new calc1();
        int res1=obj.add(3,4);
        int res2=obj.add(3,4,5);
        double res3=obj.add(3.5,4.5,5.5);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
