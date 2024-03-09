package MUTABLE;
public class Mutable_string 
{
    public static void main(String[] args) 
    {
      //ImmutableString:-

        String brand = "pwskills";
        System.out.println(brand);
        brand.concat("bengaluru"); //concat can be written same as append in mutable string
        System.out.println(brand);

        //MutableString:-
        StringBuilder brand1 = new StringBuilder("pwskills");
        System.out.println(brand1);      
        brand1.append("bengaluru"); //append used to add words..concat does the same word....in java strings are immutable as we use string class.....
        System.out.println(brand1);
      
    }
}
