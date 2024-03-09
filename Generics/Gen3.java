package Generics;
import java.util.*;

class Gen<T>
{
    T obj;
    public Gen(T obj)
    {
        this.obj = obj;
    }
    void disp()
    {
        System.out.println("the type of data is : " + obj.getClass().getName());
    }
    public T getobj()
    {
        return obj;
    }

}

public class Gen3 
{
    public static void main(String[] args) 
    {
        Gen<Integer> g1 = new Gen<Integer>(10);

        g1.disp();
        System.out.println(g1.getobj());

        System.out.println("--------------------------------");

        Gen<String> g2 = new Gen<String>("rohan");

        g2.disp();
        System.out.println(g2.getobj());

        // ArrayList<String> list1= new ArrayList<String>();

        // List<String> list2= new ArrayList<String>();

        // Collection<Integer> list3= new ArrayList<Integer>();

        // //List<Object> list4= new ArrayList<String>(); compile time error(both should be same.) and <int > also not allowed

        
        // ArrayList<Gen> list5= new ArrayList<Gen>();






        
    }
    
}
