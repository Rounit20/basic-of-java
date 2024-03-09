package Collection;
import java.util.*;

public class TreeS //IN order traverser - LVR

{
    public static void main(String[] args) 
    {
        TreeSet ts = new TreeSet(); 

        ts.add(100);
        ts.add(14);
        ts.add(150);
        ts.add(200);
        ts.add(40);
        ts.add(44);
        ts.add(86);
        ts.add(86); // duplicate values will be ignored or null

        System.out.println(ts); // order of insertion is not preserved

        //order is in sorted array(ascending) back mein (binary search tree) ko follow karta hai

        System.out.println(ts.higher(40));
        System.out.println("--------------------------------");
        System.out.println(ts.lower(34));
        System.out.println("--------------------------------");
        System.out.println(ts.ceiling(34));
        System.out.println("--------------------------------");
        System.out.println(ts.floor(179));
        System.out.println("--------------------------------");
        System.out.println(ts.floor(86));//agar floor() and ceiling() mein jo value input kiye hai wo treeset mein hoga toh wo hi print ho jayega.higher() and lower() ka ye case nhi hai..

        
    }
    
}
