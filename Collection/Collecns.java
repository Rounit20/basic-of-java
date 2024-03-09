package Collection;
import java.util.*;

//Collection and Collections class in java
public class Collecns 
{
    public static void main(String[] args) 
    {
        ArrayList all = new ArrayList();
        
        all.add(100);
        all.add(50);
        all.add(150);
        all.add(25);
        all.add(75);
        all.add(125);

        System.out.println(all);
         
        Collections.sort(all);
        System.out.println("after sorting");
        System.out.println(all);

        System.out.println("--------------------------------");

        
        
        ArrayList<String> al2 = new ArrayList<String>();

        al2.add("rohan");
        al2.add("robin");
        al2.add("java");
        al2.add("python");

        System.out.println(al2);
        
        System.out.println("after sorting");
        Collections.sort(al2);
        System.out.println(al2);

        


        ArrayList al3 = new ArrayList();
        
        al3.add(10);
        al3.add(20);
        al3.add(30);
        al3.add(40);
        al3.add(75);
        al3.add(125);

        System.out.println("---------------------------------");
        System.out.println(al3);

        int index =Collections.binarySearch(al3,40);

        System.out.println("INDEX : " + Collections.binarySearch(al3,40));


        Collections.rotate(al3,3);
        System.out.println("--------------------------------");
        System.out.println(al3);

        Collections.shuffle(al3);
        System.out.println("--------------------------------");
        System.out.println(al3);

        
        System.out.println("--------------------------------");
        System.out.println(Collections.frequency(al3,30));
        




        
        
    }
    
}
