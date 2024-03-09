package Interface;//LAMDA EXP ONLY WORKS ON FUNCTIONAL INTERFACE 
interface car
{
    void drive(int avg ,int limit);
}   


public class LamdaEXP 
{
    public static void main(String[] args) 
    {
     car w = (age,limit) -> System.out.println("DRIVING" + age + ":"+ limit); //car w = (int avg) -> System.out.println("DRIVING");
    
     w.drive(18,90);    
    }
}
 // agar koi parameter nhi hai toh   ()-> {}
 // agar ek hi parameter hai toh     (int age)-> {} or age -> {}
 // agar do  parameter ho toh        (p1,p2)-> {} 