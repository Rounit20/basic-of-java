package API;

enum Result 
{
    PASS,FAIL,NR;
    
}

public class Enum_switch 
{
    public static void main(String[] args) 
    {
        Result res = Result.PASS;
        switch(res)
        {
            case PASS:System.out.println("passed!");
            break;

            case FAIL:System.out.println("failed!");
            break;

            case NR:System.out.println("no result!");
            
        }

        
    }
    
}
