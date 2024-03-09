package Collection;

import java.util.*;

public class ArrayD //ArrayDeque follows Double Ended Queue ..means we can insert data both from frontend and backend..we cannot add data in the middle.. 
{
    public static void main(String[] args) 
    {
        ArrayDeque ad1 =new ArrayDeque();

        ad1.add(100);
        ad1.add(100);
        ad1.add("asdf");

        System.out.println(ad1);

        System.out.println("--------------------------------");

        ad1.addFirst(10);
        ad1.addLast(2000);

        System.out.println(ad1);
        System.out.println("--------------------------------");

        ad1.offer(500); //ye data insert ho jaye iska koi guarantee nhi hai..d
        ad1.offerFirst(44);
        ad1.offerLast(56);

        System.out.println(ad1);
        
    }
    
}
