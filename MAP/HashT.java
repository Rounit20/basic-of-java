package MAP;
import java.util.*;

public class HashT 
{
    public static void main(String[] args) 
    {
        Hashtable ht = new Hashtable();

        ht.put(01,"asdf");
        ht.put(02,"virat");
        ht.put(03,"rohan");

       // ht.put(04, null); null values are not accepted //NullPointerException

        ht.put(05,"rohan");
        ht.put(05,"virat"); //value "virat" will taken as final value

        ht.putIfAbsent(06,"rohan"); 
        

        System.out.println(ht);

        System.out.println("--------------------");

        TreeMap tm = new TreeMap();

        tm.put(2,"virat");
        tm.put(1,"ramesh");
        tm.put(4,"rahul");
        tm.put(3, "rohit");
        tm.put(5,null);

        System.out.println(tm);//output in sorted order..
        
    }
    
}
