package I.I_O;

import java.util.*;

class Student
{
    private String name;
    private String city;
    private int age;

    public Student(String name, String city, int age)
    {
        this.name = name;
        this.city = city;
        this.age = age;

    }

    public String toString()
    {
        return " " + name + "-" + city + "- " + age;
    } 
}

public class fundamentals 
{
    public static void main(String[] args) 
    {
        
        Student st1 = new Student("Virat  "," Delhi  ",34);
        Student st2 = new Student("Sachin "," Mumbai ",56);

        ArrayList<Student> ar1 = new ArrayList<Student>();

        ar1.add(st1);
        ar1.add(st2);
    
        

       Iterator itr = ar1.iterator();// important 
       while(itr.hasNext())
       {
        for(int i=1;i<=2;i++)
        {
            System.out.print(i + " : ");
            System.out.println(itr.next());
        }
       }



        // code completion ke baad JVM shutdown ho jata and sara memory de alocate  ho jata hai
    }
    
}
