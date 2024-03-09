package Constructor;
class   Student //ENCAPSULATION, SHADOWING PROBLEM AND USE OF THIS KEYWORD.SETTERS AND GETTERS
{
   private String name ;// private variable ko same hi clas mein use kar sakte hai.
   private int age;

    Student(String name, int age)// WE CAN USE THIS (CONSTRUCTOR ).. //STUDENT IS CLASS NAME...
    {
        this.name = name;
        this.age = age;
    }
    //public void setName(String name)
    //{
    //    this.name = name;
    //}
    
    //public void setAge(int age) 
    //{
    //   this.age = age;
    //}

    public String getName() //value yaha pe assign karna hoga       
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
  
      //WE WILL USE THIS BUT USING VS CODE ... RIGHT CLICK THEN SOUCE ACTION THIS GETTTERS AND SETTERS...

    public void show()
    {
        System.out.println(name + " " + age );
    }
   
}

public class Constructor 
{
    public static void main(String[] args) 
    {
        Student obj= new Student("rahul",10);// THIS IS CALL TO THE CONSTRUCTOR WE CREATED ABOVE...
        

       // obj.age=18; IS DONO MEIN VALUE USE KAR SAKTE HAI TOH YHI NHI KARNA HAI.
       // obj.name="Rahul";

        // obj.setAge(24); 
       //  obj.setName("rajiv");
        
       int stud1Age = obj.getAge();
    
        System.out.println(stud1Age);
         obj.show();
        
    }    
    
}
