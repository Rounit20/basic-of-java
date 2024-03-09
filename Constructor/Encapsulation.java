package Constructor;
class   Student //ENCAPSULATION, SHADOWING PROBLEM AND USE OF THIS KEYWORD.SETTERS AND GETTERS
{
   private String name ;// private variable ko same hi clas mein use kar sakte hai.
   private int age;

public String getName() //value yaha pe assign karna hoga  
{
    return name;
}
public void setName(String name) 
{
    this.name = name;
}
public int getAge() 
{
    return age;
}
public void setAge(int age) 
{
    this.age = age;
}
  
//WE WILL USE THIS BUT USING VS CODE ... RIGHT CLICK THEN SOUCE ACTION THIS GETTTERS AND SETTERS...

public void show()
{
    System.out.println(name + " " + age );
}


   
}

public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Student obj= new Student();
        Student obj1= new Student();

       // obj.age=18; IS DONO MEIN VALUE USE KAR SAKTE HAI TOH YHI NHI KARNA HAI.
       // obj.name="Rahul";

        obj.setAge(24); //ye use karna hai phir hi nxt wala.
        obj.setName("rajiv");
        
        obj1.setAge(25); 
        obj1.setName("naveen"); 
        
        int stud1Age = obj1.getAge();
    
        System.out.println(stud1Age);
         obj.show();
         obj1.show();
    }    
}