package Inheritence;

class Human //super class //base class //parent class 
{
    private String name;
    int age;
    Human()
    {
        System.out.println("human constructor");
    }
    void sleep()
    {
        age =18;
        System.out.println("good sleep");
        System.out.println(age);
    }
}

class student extends Human //child class //sub class // derived class

 {
    void disp()
    {
        System.out.println(age);
       // System.out.println(name); private class inherit nahi hota hai
    }
 }


class Inheritence1 
{
    public static void main(String[] args) 
    {
      student s1 = new student();
      s1.sleep();   
      s1.disp();// we are calling constructor here..constructor is not inherited.
    }    
}

