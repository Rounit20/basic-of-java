public class Test     //29th may [instance variable vs local variable]
{
    int a=2;    //instance variable
    String name="ayush";  // instance variable

    public static void main(String[] args)
    {
        //declare the variable
        //create the object
        int nums=9;    //   primitive

        System.out.println(nums);//just to remove the yellow line under nums..
        
        Test obj1 = new Test();  //reference
        Test obj2  = new Test(); //reference

        obj1.name="naveeen";

        System.out.println(obj1.a);
        System.out.println(obj1.name);


        System.out.println(obj2.a);
        System.out.println(obj2.name);

    }
}
