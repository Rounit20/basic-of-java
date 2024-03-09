package Array.Array;
public class Jagged_array //no. of rows are fixed but no. of columns are not
{
   public static void main(String[] args) 
{
    // int a[][]= new int[3][];
    // nums[0]= new int[4];
    // nums[1]= new int[2];
    // nums[2]= new int[3];
    // a[0][0]=3;
    // a[1][0]=4;
    // a[2][0]=9;
    // a[0][1]=5;
    // a[1][1]=7;
    // a[2][1]=2;
    // we have to assign values too

    
    int a[][] = {
                    {3,5,4,9},{4,7},{9,2,1}
                };

    for(int i=0;i<=2;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
}
}

    

