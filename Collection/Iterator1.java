package Collection;
import java.util.*;


public class Iterator1 //Iterator or cursor  and list Iterator
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        
        al.add(27);
        al.add(563);
        al.add(100);
        al.add(76);
        al.add(65);

        System.out.println(al);

        //BOTH ARE NOT RECOMMENDED

        //for loop

        // for(int i=0; i<al.size(); i++)
        // {
        //    //Object o = al.get(i);
        //    //System.out.println(o);

        //    System.out.println(al.get(i));
        // }

        // System.out.println("--------------------------------");

        // // for each 
        // for(Object o : al)
        // {
        //     System.out.println(o);  
        // }

        // BEST WAY ITERATOR

        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            
           //Integer i = (Integer) itr.next();
           // System.out.println(i);

           System.out.println(itr.next());
        }

        System.out.println("--------------------------------");

        ListIterator litr = al.listIterator(al.size()); 

        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }

        // we can print in reverse order TOO with the help of ListIterator   also and we can only use it in the list class ie ArrayList and LinkedList


    }
    
}