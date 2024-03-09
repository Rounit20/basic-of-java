package API;
//import java.util.Date;

public class date_time 
{
    public static void main(String[] args) 
    {
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);

        long timeInMs = dt.getTime();

        java.sql.Date dt1 = new java.sql.Date(timeInMs);//in sql package we have to pass some data..and we will get only date in sql package 
        System.out.println(dt1);
        
    }
    
}
