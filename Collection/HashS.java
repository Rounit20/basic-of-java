package Collection;

import java.util.*;

public class HashS 
{
    public static void main(String[] args) 
    {
       HashSet hs = new HashSet();
       hs.add(100);
       hs.add(25);
       hs.add(50);
       hs.add(65);
       hs.add(189);
       hs.add("wj"); //strings are  allowed.but duplicates are not allowd

       System.out.println(hs); //Hasing is followed i.e HashTable..LoadFactor is 0.75..iske baad double..

       //to get the output in the order of insertion..we will use LinkedHashSet.

       LinkedHashSet hs1 = new LinkedHashSet(); //it follows both HashTable and Linked list.
       hs1.add(100);
       hs1.add(25);
       hs1.add(50);
       hs1.add(65);
       hs1.add(189);
       hs1.add("wj");

       System.out.println("------------------------");
       System.out.println(hs1);
        
    }    
}
