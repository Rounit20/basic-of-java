package Operator;
public class Incrementation_and_Decrementation__AND_OTHER_OPERATORS
{
    public static void main(String[] args)
    {
        //int a=5;
        //a=a+1;//or a++(for inc one value)
        //int b=6;
        //b=b-1;// or b--(for dec one value)
        //System.out.println(a);
        //System.out.println(b);

        //NOTE:- CONDITION OF PRE AND POST Incrementation_and_Decrementation

        int a=5;
        int b=a++;
        System.out.println(a);
        System.out.println(b);

        int c=6;
        int d=++c;
        System.out.println(c);
        System.out.println(d);

        int e=4;
        int f= e++ + ++e + --e;
        System.out.println(e);
        System.out.println(f);

        //ASSIGNMENT OPERATOR:-
        //EQUALS TO OPERATOR

        int m1,m2,m3;
        m1=m2=m3=15;
        System.out.println(m1 + " " + m2 + " " + m3 ); //concatenation = " "

        //IMP:- COMPOUND ASSIGNMENT

        int z=15;
        z+=5;
        System.out.println(z);// NOTE :- WE CAN USE ANY OPERATOR IN THE PLACE OF (+)..LIKE "/" "*" "-" "%"
    }
}
