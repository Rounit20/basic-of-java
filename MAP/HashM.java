package MAP;
import java.util.*;

public class HashM 
{
    public static void main(String[] args) 
    {
        HashMap hm = new HashMap(); //load factor 0.75

        // NOTE: Key can be of any type

        // Hashtable ht = new Hashtable();
        // LinkedHashMap lhm = new LinkedHashMap();
        // TreeMap tm = new TreeMap();

        hm.put(01,"asdf");
        hm.put(02,"virat");

       // hm.put(02,"virat"); it will not be repeated as key should be unique  

        hm.put(03,"rohan");
        hm.put(null, null); //we give null as value
        hm.put(05,"rohan");
        hm.put(05,"virat"); //value "virat" will taken as final value

        System.out.println(hm);
        
        //order of insertion mein output ayega iska koi guarantee nhi hai

        HashMap hm1 = new HashMap();

        hm1.put("rohan","virat");
        hm1.put(1.1,"virat");
        hm1.put('a',"virat");
        hm1.put(1,"virat");
        

        System.out.println("------------------------------");

        System.out.println(hm1);

        LinkedHashMap lhm = new LinkedHashMap();

        lhm.put("rohan","virat");
        lhm.put(1.1,"virat");
        lhm.put('a',"virat");
        lhm.put(1,"virat");

        System.out.println("------------------------------");
        System.out.println("After using LinkedHashMap   ");

        System.out.println(lhm);
    }
    // NOTE:-
    // 1. HashMap is synchronized means at a time only one thread will be operated means it is thread safe

    // 2. LinkedHashMap is  non synchronized means at a time multiple thread will be operated means it is not  thread safe


    
}
