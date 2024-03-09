package Array.Array;
public class Array_exception  //"ArrayIndexOutOfBoundsException"
{
 public static void main(String[] args) 
 {
    int nums[]={2,3,4,6};
    System.out.println(nums[nums.length-1]);
    System.out.println("bye");
    
    for(int i=0;i<4;i++) //or i<=(nums.length-1)
    {
        System.out.println(nums[i]);
    }

    //ENHANCED:-

    System.out.println("using enhanced for loop");

    for(int n:nums)
    {
        System.out.println(n);
    }



 }   
}
