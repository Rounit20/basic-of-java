package API;
import java.util.*;
import java.util.stream.*;

import java.util.Arrays;

public class stream1 
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(2,3,9,6,8);
        
        Stream<Integer> streamData = list.stream();
        Stream<Integer> finalStream =streamData.filter(n->n%2==0).sorted().map(n->n*3);
       
       
        // Stream<Integer> sortedStream =filStream.sorted();
        // Stream<Integer> mapStream =sortedStream.map(n->n*3);

    
        finalStream.forEach(i->System.out.println(i));
        

        // long count =streamData.count();
        // System.out.println(count);//we can work on stream only once

        
        // streamData.forEach(i->System.out.println(i));
        
    }
    
}
