package Collection;

import java.util.*;

public class ArrayL 
{
    public static void main(String[] args) 
    {
        ArrayList al1 = new ArrayList(); // ArrayList implements List interface

        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1 );
        System.out.println("--------------------------------");

        ArrayList al2 = new ArrayList();

        al2.add("trying");
        al2.add(8726);
        al2.add('j');
        al2.add(1.1);

        System.out.println(al2);
        System.out.println("--------------------------------");
        

        ArrayList al3 = new ArrayList();

        al3.add("try");
        al3.addAll(al2);
        
        System.out.println("After adding collection al2"   );
        System.out.println(al3);

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("AFTER ADDING  A particular element AT PARTICULAR INDEX");

        al3.add(2,"java"); //previous data will get shifted..to nxt index number. it is not recommened to use this ..we can use this by using LinkedList..
        
        System.out.println(al3);

        ArrayList al4 = new ArrayList();

        al4.add(1);
        al4.add(2);
        al4.add(3);
        al4.add(4);
        al4.add(4); //duplication also allowed. and order of insertion is also preserved.

        al4.addAll(2,al1);

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("after adding array list to particular index: " );
        
        System.out.println(al4);
    }
}
