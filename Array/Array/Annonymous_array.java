package Array.Array;
class Calc
{
    public int add(int  nums[])
    {
        int result = 0;
        for(int n:nums)
        {
            result = result + n;
        }
        return result;
    }
}

public class Annonymous_array   //it can be used only once
{
    public static void main(String[] args) 
    {
      Calc obj= new Calc();
      int nums[]={2,3,5,6};
      int result=obj.add(nums);

      //ANNONYMOUS ARRAY:- ABOVE LINE CODES (2 LINES) CAN BE WRITTEN AS 
      
      //int result=obj.add(new int[]{2,3,5,6});
      
      System.out.println(result);  
    }
}
