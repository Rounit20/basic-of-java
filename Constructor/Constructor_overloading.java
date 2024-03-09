package Constructor;// bohot imppppp:-

class Student1

{
    private String name;
    private int age;
    
    public Student1()
    {   
        //super();
        this("rohit",16);
        System.out.println("Default constructor is called");
        name="Rohan";
        age=18;
    } 
    Student1(String name)
    {
        this();
        this.name=name;
        age=19;
    }
    Student1(String name,int age)
    {

        this.name=name;
        this.age=age;

    }
    void disp()
    {
        System.out.println(name);
        System.out.println(age);

    }
}
public class Constructor_overloading 
{  
    public static void main(String[] args) 
    {
        Student1 st1 = new Student1();
        st1.disp();

        Student1 st2 = new Student1("rahul");
        st2.disp();

        Student1 st3 = new Student1("rohit",19);
        st3.disp();

    }
   


}
