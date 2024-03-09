package Interface;

import java.util.Arrays;
//import java.util.function.Consumer;
import java.util.*;


public class forEach 
{
    public static void main(String[] args) 
    {
        // List list1 = new ArrayList<Integer>();
        // list1.add(2);
        // list1.add(4);
        // list1.add(5);
        // list1.add(6);
        // list1.add(9);
        // System.out.println(list1);

        List<Integer> list1 = Arrays.asList(2,4,5,6,9);
        System.out.println(list1);

        // for(Integer x:list1)
        // {
        //     System.out.println(x);
        // }
        
        //OR:-

        list1.forEach(n->System.out.println(n));

        //OR:-

        // Consumer<Integer> cons =i-> System.out.println(i); 
        // list1.forEach(cons);

        
    }
    
}
