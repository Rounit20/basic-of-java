package API;
import java.lang.annotation.Annotation;
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) //power till JVM
@interface CricketPlayer
{
    String country() default "India";
    int age() default 40;

}

@CricketPlayer // OR @CricketPlayer(country = "India")
class Virat
{
    @CricketPlayer
    private int innings;
    private int runs;
    
    @CricketPlayer
    public int getruns()
    {
        return runs;
    }
    public void setruns(int runs)
    {
        this.runs = runs;
    }
    public int getinnings()
    {
        return innings;
    }
    public void setinnings(int innings)
    {
        this.innings =innings;
    }
}

public class C_Annotation 
{
    public static void main(String[] args) 
    {
        Virat v = new Virat();
        v.setinnings(34);
        v.setruns(10000);
        System.out.println(v.getinnings());
        System.out.println(v.getruns());

        Class c= v.getClass();
        Annotation a = (Annotation) c.getAnnotation(CricketPlayer.class);

        CricketPlayer cp = (CricketPlayer)a;
        String country = cp.country();
        System.out.println(country);
        
    }
    
}
