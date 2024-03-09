package Operator;


public class CONDITIONAL
{
    public static void main(String[] args)
      //  int age = 18;
        //  if (age >= 18)
        //  {
        //  System.out.println("legal adult");
        //  }
        //  else
        //  {
        //  System.out.println("u r a child");
        //  }


     //int age = 61;
        // if (age >= 18 && age < 60)
        // {
        // System.out.println(" working age");
        //  }
        // else if (age > 60)
        //  {
        //     System.out.println("u r retired");
        //   }
        //   else
        //   {
             //System.out.println(" YOU ARE A KID");

         //}


       //NESTING:-


    { int age=35;
        if (age>=18 && age<=60 )
        {
            if(age>=20 && age<30)
            {
                System.out.println("YOU ARE IN YOUR 20s");
            }
            else if(age>=30 && age<40)
            {
                System.out.println("YOU ARE IN YOUR 30s");
            }
            else if(age>=40 && age<50)
            {
                System.out.println("YOU ARE IN YOUR 40s");

            }
            else if(age>=50 && age<60)
            {
                System.out.println("YOU ARE IN YOUR 50s");
            }
            else
            {
                System.out.println("YOU ARE A TEEN");
            }

        }

        else if(age>60)
        {
            System.out.println("YOU ARE A OLD MAN");
        }
        else if (age>=16 && age <18)
        {
            System.out.println("YOU ARE A TEENAGER");
        }
        else
        {
            System.out.println("KID");
        }
    }
}
