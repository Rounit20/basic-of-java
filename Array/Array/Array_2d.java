package Array.Array;
public class Array_2d
{
   public static void main(String[] args) 
{
    //int a[][]= new int[3][2];
    //a[0][0]=3;
    //a[1][0]=4;
    //a[2][0]=9;
    //a[0][1]=5;
    //a[1][1]=7;
    //a[2][1]=2; 

    int a[][] = {
                    {3,5},{4,7},{9,2}
                };

    for(int i=0;i<=2;i++)
    {
        for(int j=0;j<=1;j++)
        {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println(a.length);
    System.out.println(a[0].length);

    String name ="qwerty";
    System.out.println(name.length());


    //length ek property hai array ki
    //length() ek method hai string  mein
}
}

    

