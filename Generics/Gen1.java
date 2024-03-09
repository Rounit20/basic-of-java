package Generics;
import java.util.*;

public class Gen1 
{
    public static void main(String[] args) 
    {
        //typesafety 
        String ar[] = new String[10];
        ar[0] = "rohan";
        ar[1] = "rohit";
        ar[2] = "shivam";
        ar[3] = "ayush";

        String name1 =ar[0];
        String name2 =ar[1];
        String name3 =ar[2];
        String name4 =ar[3];

        //we can use array list too.//it has no type safety

        ArrayList<String> al = new ArrayList<String>();

        al.add("rohan");
        al.add("rohit");
        //al.add(10); it will give error here

        // String n1 = (String) al.get(0); //TypeCasting
        // String n2 = (String) al.get(1);
        //  String n3= (String) al.get(2);  //it will give error at run time   //ClassCastException

        // NOTE:-
        // That's why we need to use generics


        String n1 = al.get(0);
        String n2 = al.get(1);

        


        
    }
    
}
