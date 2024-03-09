package Interface;

interface A // Interface ke anadar varible define nahi sirf declare ho sakte hai..4
{
 int num =7;
 void show();
}


public class inter 
{
    public static void main(String[] args) 
    {
        System.out.println(A.num);
        
       //  A.num =9l; // value of num cannot be changed

       // A objA = new A(); // cannot instantiate means cannot make object
    }    
}
