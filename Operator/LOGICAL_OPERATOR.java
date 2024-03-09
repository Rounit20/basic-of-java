package Operator;
public class LOGICAL_OPERATOR
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        // we can also use boolean

        System.out.println(a == b && a < b && b > c);
        System.out.println(a < b && b < c && a < c);
        System.out.println(a < b || b > c || c < a);
        System.out.println(!true);
    }
}
