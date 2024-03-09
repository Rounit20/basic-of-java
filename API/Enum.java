package API;

enum Week

{
    Mon,Tue,Wed,Thu,Fri,Sat,Sun,
}
public class Enum 
{
    enum Result
    {
        PASS ,FAIL,NR;
        
        int marks;

        Result()
        {
            System.out.println("Construct in ENUM");
        }

        void setMarks(int marks)
        {
            this.marks = marks;
        }

        int getMarks()
        {
            return marks;   
        }
    }

    public static void main(String[] args) 
    {
        // Week w = new Week(); WE CANNOT MAKE OBJECT OF ENUM CLASS.

        // Week w = Week.Mon;
        // System.out.println(w);
        // System.out.println(w.ordinal()); //index
        
        // Week []wr = w.values();
        // for(Week i:wr)
        // {
        //     System.out.println(i.ordinal()+ ":" + i+ " ");

        // }

        // Result r =Result.PASS;
        // System.out.println(r);

        Result.PASS.setMarks(50);
        int m1 = Result.PASS.getMarks();
        System.out.println(m1);

        Result.FAIL.setMarks(49);
        int m2 = Result.FAIL.getMarks();
        System.out.println(m2);

        
        int m3 = Result.NR.getMarks();
        System.out.println(m3);
        
    }
    
}
