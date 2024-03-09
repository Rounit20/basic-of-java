package API;

class plane
{
    public void fly()
    {
        System.out.println("plane flies");
    }

    
    class cargoPlane extends plane
    {
        @Override //Annotation
        public void fly()
        {
            System.out.println("cargoplane flies ");
        }
    }

}

public class Annotation 
{
    public static void main(String[] args) 
    {
        // eg o ANNOTATIONS:-
        // 1. @Override
        // 2. @FuctionalInterface 
        
    }
    
}
