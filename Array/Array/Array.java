package Array.Array;
public class Array
{
    public static void main(String[] args)
    {
        int nums[]={5,4,3,7};
        String NAME[]={"rahul","manoj","raj","sumit"};

        //NOTE:- IF WE DON'T KNOW THE VALUES

        //int nums[] = new int[4];
        //nums[0]=5;
        //nums[1]=4;
        //nums[2]=3;
        //nums[3]=7;

        for(int i=0;i<4;i++)
        {
            System.out.println(nums[i]);
        }
        for(int j=0;j<4;j++)
        {
            System.out.println(NAME[j]);
        }
        System.out.println(nums.length);
        
    }
}
