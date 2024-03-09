package Generics;
import javax.swing.event.SwingPropertyChangeSupport;
import java.util.*;

import Collection.ArrayL;
import Collection.Collecns;

//Comparator vs Comparable interface (very important)

class Student implements Comparable<Student>
{
    int marks;
    int age;
    String name;

    public Student(int marks,int age, String name)
    {
        this.marks = marks;
        this.age = age;
        this.name = name;

    }
    public int getMark()
    {
        return marks;

    }
    public int getage()
    {
        return age;

    }
    public String getName()
    {
        return name;

    }
    public String toString() //remember this method..
    {
        return "" + marks + "-" + age + "-" + name;
    }

    public int compareTo(Student a) //Important
    {
        if(this.age>a.age)
        return 1;
        else 
        return -1;
    }


}

// class Alpha implements Comparator<Student>
// {
//     public int compare(Student a,Student b)
//     {
//         if(a.marks>b.marks)
//             return 1;
//         else
//             return -1;
        
//     }

// }
public class Gen4 
{
    public static void main(String[] args) 
    {
        Student st1 = new Student(45, 19, "ROHAN");
        Student st2 = new Student(35, 18, "ROHIT");
        Student st3 = new Student(78, 17, "AYUSH");

        List<Student> ls1 =new ArrayList<Student>();

        ls1.add(st1);
        ls1.add(st2);
        ls1.add(st3);
        System.out.println(ls1);

        //Collections.sort(ls1);

        // Alpha a = new Alpha();

        //use this method if u don't jave rights to change the data of the target class

        // Comparator<Student> com =(Student a, Student b)-> 
        // {
        //     if(a.marks>b.marks)
        //     return 1;
        // else
        //     return -1;
        // };


        // Collections.sort(ls1,com);

        Collections.sort(ls1);

        System.out.println(ls1);



        
    }
    
}
