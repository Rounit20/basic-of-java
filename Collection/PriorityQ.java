package Collection;

import java.util.PriorityQueue;

public class PriorityQ //Min-Heap DS like binary tree.
{
    public static void main(String[] args) 
    {
        PriorityQueue pq = new PriorityQueue();

        pq.add(100);
        pq.add(150);
        pq.add(23);
        pq.add(1245);
        pq.add(23);// duplication is allowed
        //pq.add("string"); not allowed // ClassCastException
        

        System.out.println(pq); // kisi bhi order mein output aa sakta hai..
        
    }

    
}
